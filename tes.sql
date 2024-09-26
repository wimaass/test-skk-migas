-- 4a
SELECT *
FROM barang b
WHERE b.harga > 10000
ORDER BY b.harga ASC;

-- 4b
SELECT *
FROM Pelanggan p
WHERE p.nama ILIKE '%g%' 
AND p.alamat = 'BANDUNG';

-- 4c
SELECT 
t.kode, 
t.tanggal, 
p.nama AS nama_pelanggan, 
b.nama AS nama_barang, 
t.jumlah_barang AS jumlah,
b.harga AS harga_satuan,
(t.jumlah_barang * b.harga) AS total
FROM Transaksi t
JOIN Pelanggan p ON t.kode_pelanggan = p.kode
JOIN Barang b ON t.kode_barang = b.kode
ORDER BY p.nama, t.tanggal ASC

-- 4d
SELECT 
p.nama AS nama_pelanggan, 
SUM(t.jumlah_barang) AS jumlah,
SUM(t.jumlah_barang * b.harga) AS total_harga
FROM Transaksi t
JOIN Pelanggan p ON t.kode_pelanggan = p.kode
JOIN Barang b ON t.kode_barang = b.kode
GROUP BY p.nama
ORDER BY p.nama ASC
