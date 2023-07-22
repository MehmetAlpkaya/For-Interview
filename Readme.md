# Proje Adı

Proje Adı, Java Spring ile oluşturulmuş bir uygulamadır. Bu uygulama, şirket ve çalışan gibi iki adet tablo arasındaki ilişkiyi gösteren basit bir örnektir. Proje, temel CRUD (Create, Read, Update, Delete) işlemlerini gerçekleştirebileceğiniz RESTful API'ları içerir.

## Başlarken

Bu talimatlar, projeyi yerel makinenizde çalıştırmak ve geliştirmek için size kılavuzluk edecektir.

### Kullanılan Teknolojiler

- Java JDK 11 veya üzeri
- Maven
- Git
- Spring Boot
- Spring Data JPA
- MySql
- Swagger

### Proje Yapısı

Projemiz, MVC mimarisine uygun olarak üç ana bileşeni içerir:

1. Model (Entity Sınıfları): Veritabanı tablolarını temsil eden sınıflardır. Bu örnekte "Company" ve "Employee" sınıfları Model olarak kullanılmıştır.
2. View (Swagger UI): API belgelerini görselleştiren ve API'lerle etkileşime geçmemizi sağlayan Swagger UI'dir.
3. Controller (Controller Sınıfları): HTTP isteklerini alıp uygun servislere yönlendiren sınıflardır. Bu örnekte "CompanyController" ve "EmployeeController" sınıfları Controller olarak kullanılmıştır.

### Servis Kullanımı

Proje, iki adet servis sınıfı içerir: "CompanyService" ve "EmployeeService". Bu servisler, iş mantığı işlemlerini gerçekleştirir ve veritabanı işlemleri için ilgili repository sınıflarını kullanır.

CompanyService: Şirketlerle ilgili işlemleri gerçekleştiren servis sınıfıdır. Şirket ekleme, güncelleme, silme ve listeleme işlemlerini içerir.

EmployeeService: Çalışanlarla ilgili işlemleri gerçekleştiren servis sınıfıdır. Çalışan ekleme, güncelleme, silme ve listeleme işlemlerini içerir.

Servisleri kullanmak için Controller sınıflarında ilgili endpointlere yönlendirme yapılır ve HTTP isteklerine göre ilgili servis metotları çağrılır.
### Api Endpointleri
Şirketleri Listeleme:

- Method: GET
- Endpoint: /companies

Şirket Ekleme:

- Method: POST
- Endpoint: /companies 
- Request Body:
{
   "name": "Company Name"
}

Şirket Güncelleme:

- Method: PUT
- Endpoint: /companies/{id}
- Request Body: {
  "name": "Updated Company Name"
  }

Şirket Silme:

- Method: DELETE
- Endpoint: /companies/{id}

Çalışanlar
Çalışanları Listeleme:

 - Method: GET
- Endpoint: /employees
Çalışan Ekleme:

- Method: POST
- Endpoint: /employees
- Request Body: {
  "name": "Employee Name",
  "position": "Employee Position",
  "companyId": 1
  }


Çalışan Güncelleme:

- Method: PUT
- Endpoint: /employees/{id}
- Request Body: {
  "name": "Updated Employee Name",
  "position": "Updated Employee Position",
  "companyId": 1
  }

Çalışan Silme:

- Method: DELETE
- Endpoint: /employees/{id}

