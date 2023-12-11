# Tourism Agency API

Bu proje, bir turizm ajansının otel yönetimi için geliştirilmiş bir RESTful API'yi içermektedir. Aşağıda API endpoint'lerini ve kullanımını gösteren bir rehber bulunmaktadır.



![Ekran Görüntüsü (55)](https://github.com/cgezginci/TourismManagementRestAPI/assets/143842154/0e9c2056-e104-46a8-b7c2-5a7fd184328b)


## Facility (Tesis) API Endpoint'leri

- **Yeni Tesis Ekleme**
  - Endpoint: `POST /v1/facility`
  - Açıklama: Yeni bir tesis ekler.

- **Tesis Bilgisi Getirme**
  - Endpoint: `GET /v1/facility/{id}`
  - Açıklama: Belirtilen ID'ye sahip tesisin bilgilerini getirir.

## Hostel API Endpoint'leri

- **Yeni Hostel Ekleme**
  - Endpoint: `POST /v1/hostel`
  - Açıklama: Yeni bir hostel ekler.

- **Hostel Bilgisi Getirme**
  - Endpoint: `GET /v1/hostel/{id}`
  - Açıklama: Belirtilen ID'ye sahip hostelın bilgilerini getirir.

## Hotel (Otel) API Endpoint'leri

- **Yeni Otel Ekleme**
  - Endpoint: `POST /v1/hotel`
  - Açıklama: Yeni bir otel ekler.

- **Otel Bilgisi Getirme**
  - Endpoint: `GET /v1/hotel/{id}`
  - Açıklama: Belirtilen ID'ye sahip otelin bilgilerini getirir.

- **Otel Silme**
  - Endpoint: `DELETE /v1/hotel/{id}`
  - Açıklama: Belirtilen ID'ye sahip oteli siler.

- **Otel Güncelleme**
  - Endpoint: `PUT /v1/hotel`
  - Açıklama: Belirtilen oteli günceller.

- **Otel Adına Göre Arama**
  - Endpoint: `GET /v1/hotel/{name}`
  - Açıklama: Belirtilen otel adına göre arama yapar.

## Reservation (Rezervasyon) API Endpoint'leri

- **Yeni Rezervasyon Ekleme**
  - Endpoint: `POST /v1/reservation`
  - Açıklama: Yeni bir rezervasyon ekler.

- **Rezervasyon Bilgisi Getirme**
  - Endpoint: `GET /v1/reservation/{id}`
  - Açıklama: Belirtilen ID'ye sahip rezervasyonun bilgilerini getirir.

- **Rezervasyon Silme**
  - Endpoint: `DELETE /v1/reservation/{id}`
  - Açıklama: Belirtilen ID'ye sahip rezervasyonu siler.

- **Rezervasyon Güncelleme**
  - Endpoint: `PUT /v1/reservation`
  - Açıklama: Belirtilen rezervasyonu günceller.

## Room (Oda) API Endpoint'leri

- **Yeni Oda Ekleme**
  - Endpoint: `POST /v1/room`
  - Açıklama: Yeni bir oda ekler.

- **Oda Bilgisi Getirme**
  - Endpoint: `GET /v1/room/{id}`
  - Açıklama: Belirtilen ID'ye sahip odanın bilgilerini getirir.

- **Oda Silme**
  - Endpoint: `DELETE /v1/room/{id}`
  - Açıklama: Belirtilen ID'ye sahip odayı siler.

- **Oda Güncelleme**
  - Endpoint: `PUT /v1/room`
  - Açıklama: Belirtilen odayı günceller.

- **Otel Adına Göre Odaları Listeleme**
  - Endpoint: `GET /v1/room/filter/{hotelName}`
  - Açıklama: Belirtilen oteldeki odaları listeler.

- **Tarih Aralığına Göre Odaları Listeleme**
  - Endpoint: `GET /v1/room/date`
  - Açıklama: Belirtilen tarih aralığındaki odaları listeler.

## Room Features (Oda Özellikleri) API Endpoint'leri

- **Yeni Oda Özelliği Ekleme**
  - Endpoint: `POST /v1/room-features`
  - Açıklama: Yeni bir oda özelliği ekler.

## Room Types (Oda Tipleri) API Endpoint'leri

- **Yeni Oda Tipi Ekleme**
  - Endpoint: `POST /v1/room-types`
  - Açıklama: Yeni bir oda tipi ekler.


