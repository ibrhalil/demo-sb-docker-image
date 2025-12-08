
# demo-sb-docker-image
Spring Boot 3.3.7 LTS + Java 21 

---

## 🧭 Genel Prensip

Bu servis iki farklı seviyede port yönetimi içerir:

| Katman | Port Kaynağı | Port | Amaç |
|--------|--------------|-------|--------|
| **Local** | `application.yml` | 8070 | IDE veya CLI ile lokal geliştirme |
| **Docker Host** | `docker-compose.yml` | 8090 | Dış dünyaya açılan port |

---

## 🧱 Proje Yapısı

```
demo-sb-docker-image/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/ibrhalil
 │   │   └── resources/application.yml
 │   ├── test/
 ├── ms/
 │   ├── Dockerfile
 │   └── docker-compose.yml
 ├── pom.xml
 └── README.md
```

---

## ⚙️ 1. Local Çalıştırma

Varsayılan lokal port, `application.yml` içindedir:

### `src/main/resources/application.yml`
```yaml
server:
  port: 8070
```

Çalıştır:

```bash
mvn spring-boot:run
```

Test:

```bash
curl http://localhost:8070/hello
```

### 🔄 Lokal port değiştirmek için:
```bash
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8071
```
---

## 🌐 2. Docker Host Port Ayarları

Compose dosyasında host portu **8090** olarak belirlenmiştir:

Çalıştır:

```bash
docker compose up -d
```

Test:

```bash
curl http://localhost:8090/hello
```

---

## 🔨 3. Build & Image Oluşturma

Maven build ile Docker image otomatik oluşur:

```bash
mvn clean install
```

Image doğrulama:

```bash
docker images | grep demo-sb-docker-image
```

---

## ▶️ 5. Çalıştırma Özet

### Local:
```bash
mvn spring-boot:run
```

### Docker:
```bash
docker compose up -d
```

### Test URL’leri:
- Local:  http://localhost:8070/hello
- Docker: http://localhost:8090/hello

---
