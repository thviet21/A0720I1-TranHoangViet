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
	join loaikhach on khachhang.idloaikhach = loaikhach.idloaikhach
    join dichvu on hopdong.iddichvu = dichvu.iddichvu
	join hopdongchitiet on hopdong.idhopdong = hopdongchitiet.idhopdong
    join dichvudikem on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
group by hopdong.idhopdong, khachhang.idkhachhang
    
