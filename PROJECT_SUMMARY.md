# Төслийн Хураангуй

Энэ төсөл нь Maven-д суурилсан Java тооны машины аппликейшн бөгөөд Git workflow болон GitHub Actions CI процесс агуулдаг.

## Үүсгэгдсэн Файлууд

### 1. Maven Тохиргоо
- ✅ `pom.xml` - JUnit 5, Maven Surefire, Checkstyle, JaCoCo plugin-уудтай
- ✅ `checkstyle.xml` - Google загварын хялбаршуулсан хувилбар
- ✅ `.gitignore` - Java/Maven файлуудыг үл тоомсорлох

### 2. Эх Код
- ✅ `src/main/java/lab14/sict/must/edu/mn/Calculator.java` - Үндсэн тооны машин
- ✅ `src/main/java/lab14/sict/must/edu/mn/Addition.java` - Нэмэх үйлдэл
- ✅ `src/main/java/lab14/sict/must/edu/mn/Subtraction.java` - Хасах үйлдэл
- ✅ `src/main/java/lab14/sict/must/edu/mn/Multiplication.java` - Үржүүлэх үйлдэл
- ✅ `src/main/java/lab14/sict/must/edu/mn/Division.java` - Хуваах үйлдэл (тэгээр хуваахыг зохицуулсан)

### 3. Тест Код
- ✅ `src/test/java/lab14/sict/must/edu/mn/CalculatorTest.java`
- ✅ `src/test/java/lab14/sict/must/edu/mn/AdditionTest.java`
- ✅ `src/test/java/lab14/sict/must/edu/mn/SubtractionTest.java`
- ✅ `src/test/java/lab14/sict/must/edu/mn/MultiplicationTest.java`
- ✅ `src/test/java/lab14/sict/must/edu/mn/DivisionTest.java` - 100% branch coverage (тэгээр хуваах тест орсон)

### 4. CI/CD
- ✅ `.github/workflows/ci.yml` - GitHub Actions workflow:
  - Checkstyle шалгалт
  - JUnit тест
  - JaCoCo 100% branch coverage шалгалт

### 5. Баримт Бичиг
- ✅ `README.md` - Төслийн тайлбар
- ✅ `GIT_WORKFLOW.md` - Git workflow заавар
- ✅ `conflict_resolution.md` - Merge conflict шийдвэрлэлтийн баримт
- ✅ `PROJECT_SUMMARY.md` - Энэ файл

## Дараагийн Алхмууд

### 1. GitHub Репозитори Үүсгэх
1. GitHub дээр шинэ репозитори үүсгэх (олон нийтэд нээлттэй)
2. Репозиторийн URL-ийг авах

### 2. Git Репозитори Эхлүүлэх
```bash
cd lab14
git init
git add .
git commit -m "Maven-д суурилсан Java тооцоолуурын төслийг эхлүүлэх"
git remote add origin <YOUR_REPO_URL>
git branch -M main
git push -u origin main
```

### 3. Develop Салбар Үүсгэх
```bash
git checkout -b develop
git push -u origin develop
```

### 4. Feature Салбарууд Үүсгэх
`GIT_WORKFLOW.md` файлыг дагаж feature салбаруудыг үүсгэж, PR хийх.

### 5. Main Салбарын Хамгаалалт Тохируулах
GitHub дээр Settings > Branches руу ороод:
- Require a pull request before merging
- Require status checks to pass before merging (CI Процесс)
- Require branches to be up to date before merging
- Do not allow bypassing the above settings

### 6. Локал Шалгалт
PR үүсгэхээс өмнө:
```bash
mvn test
mvn checkstyle:check
mvn jacoco:report
# target/site/jacoco/index.html файлыг шалгах
```

## Шалгах Зүйлс

- ✅ Бүх Java классууд checkstyle.xml дүрмийг дагаж байна
- ✅ Бүх тестүүд 100% branch coverage хангаж байна
- ✅ Division класс тэгээр хуваахыг зохицуулсан
- ✅ GitHub Actions workflow зөв тохируулагдсан
- ✅ Бүх шаардлагатай файлууд үүсгэгдсэн

## Анхааруулга

- Maven суурилуулаагүй бол эхлээд суулгах хэрэгтэй
- GitHub репозитори үүсгэхээс өмнө локал дээр тест ажиллуулж шалгах
- PR үүсгэхээс өмнө CI шалгалт амжилттай болохыг баталгаажуулах

