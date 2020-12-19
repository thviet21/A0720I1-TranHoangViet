-- task2 --
select * from nhanvien
having (substring_index(hoten, ' ', -1) like 'H%' 
	or substring_index(hoten, ' ', -1) like 'K%' 
    or substring_index(hoten, ' ', -1) like 'T%') 
    and length(substring_index(hoten, ' ', -1)) < 16;
    
-- task 3 --
select * from khachhang
having  (year(curdate()) - year(ngaysinh) between 18 and 50) and (diachi = 'Quảng Trị' or diachi = 'Quảng Nam');

-- task 4 --
select hoten, count(*) as 'Số lần book' from hopdong join khachhang on hopdong.idkhachhang = khachhang.idkhachhang
join loaikhach on khachhang.idloaikhach = loaikhach.idloaikhach
where loaikhach.tenloaikhach = 'Diamond'
group by hoten;

-- task 5 --

select khachhang.idkhachhang as IDKhachHang, khachhang.hoten as HoTen, loaikhach.tenloaikhach as LoaiKhach,
	hopdong.idhopdong as SoHopDong, dichvu.tendichvu as TenDichVu,hopdong.ngaylamhopdong as NgayLamHopDong,
    hopdong.ngayketthuc as NgayKetThuc, sum(dichvu.chiphithue+dichvudikem.gia*hopdongchitiet.soluong) as Tongtien
from hopdong left join khachhang on hopdong.idkhachhang = khachhang.idkhachhang
	left join loaikhach on khachhang.idloaikhach = loaikhach.idloaikhach
    left join dichvu on hopdong.iddichvu = dichvu.iddichvu
	left join hopdongchitiet on hopdong.idhopdong = hopdongchitiet.idhopdong
    left join dichvudikem on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
group by hopdong.idhopdong, khachhang.idkhachhang;


-- task 6 --

select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu, HopDongQuyMot.NgayLamHopDong
from DichVu left join ( select * from HopDong where NgayLamHopDong between '2019-01-01' and '2019-03-31') as HopDongQuyMot 
on DichVu.IDDichVu = HopDongQuyMot.IDDichVu 
left join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
group by DichVu.IDDichVu
having HopDongQuyMot.NgayLamHopDong is null;

-- task 7 --

select dichvu.IDDichVu, dichvu.TenDichVu, dichvu.DienTich, dichvu.SoNguoiToiDa, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu 
from dichvu join hopdong on hopdong.iddichvu = dichvu.iddichvu 
	join loaidichvu on dichvu.idloaidichvu = loaidichvu.idloaidichvu
where dichvu.iddichvu in (select iddichvu from hopdong where year(ngaylamhopdong) = 2018 ) 
and dichvu.iddichvu not in (select iddichvu from hopdong where year(ngaylamhopdong) = 2019 );

-- task 8 --

select distinct HoTen from KhachHang;
select HoTen from KhachHang group by HoTen;

-- task 9 -- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu
 -- khách hàng thực hiện đặt phòng.
 
 
 select month(HopDong2019.NgayLamHopDong) as Thang, Sum(DichVu.ChiPhiThue + DichVuDiKem.Gia*HopDongChiTiet.SoLuong) as DoanhThu
from (select * from HopDong where year(HopDong.NgayLamHopDong) = 2019) as HopDong2019
left join DichVu on DichVu.IDDichVu = HopDong2019.IDDichVU 
left join  HopDongChiTiet on HopDongChiTiet.IDHopDong = HopDong2019.IDHopDong
left join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
group by Thang; 

-- task 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select HopDong.IDHopDong, HopDong.NgayLamHopDong, HopDong.NgayKetthuc, HopDong.TienDatCoc, count(HopDongChiTiet.IDDichVuDiKem) as SoLuongDichVu
from HopDong left join HopDongChiTiet on HopDongChiTiet.IDHopDong = HopDong.IDHopDong
left join DichVuDiKem on DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
group by HopDong.IDHopDong;

-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select LoaiDichVu.IDLoaiDichVu, LoaiDichVu.TenLoaiDichVu from HopDong join DichVu on HopDong.IDDichVu = Dichvu.IDDichVu
	join LoaiDichVu on LoaiDichVu.IDLoaiDichVu = DichVu.IDLoaiDichVu
	join KhachHang on HopDong.IDKhachHang = KhachHang.IDKhachHang
	join  LoaiKhach on LoaiKhach.IDLoaiKhach = KhachHang.IDLoaiKhach
where LoaiKhach.IDLoaiKhach = 1 and KhachHang.DiaChi = 'Quảng Ngãi' or KhachHang.DiaChi ='Vinh'
group by LoaiDichVu.IDLoaiDichVu;

-- 12 Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019
--  nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019
select HopDong10122019.IDHopDong, NhanVien.HoTen as HoTenNhanVien, KhachHang.HoTen as HoTenKhachHang, KhachHang.SDT, DichVu.TenDichVu, 
count(DichVuDiKem.IDDichVuDiKem) as SL_DichVuDiKem, HopDong10122019.TienDatCoc from
(select * from HopDong where NgayLamHopDong between '2019-10-01' and '2019-12-31') as HopDong10122019
left join (select * from HopDong where NgayLamHopDong between '2019-01-01' and '2019-06-30') as HopDong01062019
on HopDong10122019.IDDichVu = HopDong01062019.IDDichVu
left join NhanVien on NhanVien.IDNhanVien = HopDong10122019.IDNhanVien
left join KhachHang on KhachHang.IDKhachHang = HopDong10122019.IDKhachHang
left join DichVu on HopDong10122019.IDDichVu = DichVu.IDDichVu
left join HopDongChiTiet on HopDongChiTiet.IDHopDong = HopDong10122019.IDHopDong
left join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
where HopDong01062019.IDDichVu is null
group by HopDong10122019.IDHopDong;
