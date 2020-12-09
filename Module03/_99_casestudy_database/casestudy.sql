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

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. 

select hoten, count(*) as 'Số lần book' from hopdong join khachhang on hopdong.idkhachhang = khachhang.idkhachhang
join loaikhach on khachhang.idloaikhach = loaikhach.idloaikhach
where loaikhach.tenloaikhach = 'Diamond'
group by hoten

