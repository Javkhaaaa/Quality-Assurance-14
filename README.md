# Calculator - Maven Java Төсөл

Энэ төсөл нь Maven-д суурилсан энгийн тооны машины Java аппликейшн юм.

## Төслийн Бүтэц

```
calculator/
├── pom.xml
├── checkstyle.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   └── java/
│   │       └── lab14/
│   │           └── sict/
│   │               └── must/
│   │                   └── edu/
│   │                       └── mn/
│   └── test/
│       └── java/
│           └── lab14/
│               └── sict/
│                   └── must/
│                       └── edu/
│                           └── mn/
└── .github/
    └── workflows/
        └── ci.yml
```

## Хэрхэн Ажиллуулах

### Төслийг Угсрах
```bash
mvn clean compile
```

### Тест Ажиллуулах
```bash
mvn test
```

### Checkstyle Шалгах
```bash
mvn checkstyle:check
```

### JaCoCo Coverage Тайлан Үүсгэх
```bash
mvn jacoco:report
```

Coverage тайланг `target/site/jacoco/index.html` файлд харж болно.

### Бүх Шалгалт Ажиллуулах
```bash
mvn clean test checkstyle:check jacoco:report
```

## CI/CD

Энэ төсөл GitHub Actions ашиглан автомат CI процесс агуулдаг:
- JUnit тестүүд
- Checkstyle кодын загварын шалгалт
- JaCoCo 100% branch coverage шалгалт

CI процесс нь `develop` болон `release/*` салбарууд руу хийсэн push болон pull request дээр автоматаар ажиллана.

## Хувилбарууд

- v1.0.0 - Эхний хувилбар
- v1.0.1 - Тэгээр хуваах алдааны засвар

# Quality-Assurance-14
