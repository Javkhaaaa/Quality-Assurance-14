# Git Workflow Заавар

Энэ файл нь төслийн Git workflow-ийг хэрхэн хэрэгжүүлэх талаар зааварчилгаа агуулна.

## 1. Git Репозитори Эхлүүлэх

```bash
# Төслийн хавтас руу орох
cd lab14

# Git репозитори эхлүүлэх
git init

# Бүх файлуудыг нэмэх
git add .

# Эхний коммит хийх
git commit -m "Maven-д суурилсан Java тооцоолуурын төслийг эхлүүлэх"

# GitHub дээр репозитори үүсгэсний дараа
git remote add origin <YOUR_REPO_URL>
git branch -M main
git push -u origin main
```

## 2. Develop Салбар Үүсгэх

```bash
# Develop салбар үүсгэх
git checkout -b develop
git push -u origin develop
```

## 3. Feature Салбарууд Үүсгэх

### Feature: Multiplication

```bash
# Develop салбараас feature салбар үүсгэх
git checkout develop
git checkout -b feature/add-multiplication

# Multiplication.java болон MultiplicationTest.java файлууд аль хэдийн үүсгэгдсэн
# Файлуудыг нэмэх
git add src/main/java/lab14/sict/must/edu/mn/Multiplication.java
git add src/test/java/lab14/sict/must/edu/mn/MultiplicationTest.java

# Коммит хийх
git commit -m "Үржүүлэх функц болон JUnit тест нэмсэн"

# Push хийх
git push -u origin feature/add-multiplication
```

### Feature: Division

```bash
# Develop салбараас feature салбар үүсгэх
git checkout develop
git checkout -b feature/add-division

# Division.java болон DivisionTest.java файлууд аль хэдийн үүсгэгдсэн
# Файлуудыг нэмэх
git add src/main/java/lab14/sict/must/edu/mn/Division.java
git add src/test/java/lab14/sict/must/edu/mn/DivisionTest.java

# Коммит хийх
git commit -m "Хуваах функц болон JUnit тест нэмсэн"

# Push хийх
git push -u origin feature/add-division
```

## 4. Pull Request Үүсгэх

GitHub дээр:
1. Feature салбарууд руу орох
2. "New Pull Request" дарж PR үүсгэх
3. Base: `develop`, Compare: `feature/add-multiplication` (эсвэл `feature/add-division`)
4. PR-ийн тайлбар нэмэх
5. CI шалгалт амжилттай бол merge хийх

## 5. Release Салбар Үүсгэх

```bash
# Develop салбараас release салбар үүсгэх
git checkout develop
git checkout -b release/v1.0.0

# Tag үүсгэх
git tag v1.0.0
git push origin release/v1.0.0
git push origin v1.0.0
```

## 6. Hotfix Салбар Үүсгэх

```bash
# Release салбараас hotfix салбар үүсгэх
git checkout release/v1.0.0
git checkout -b hotfix/v1.0.1

# Division.java файлд тэгээр хуваахыг зохицуулах нэмэлт аль хэдийн байна
# Хэрэв өөрчлөлт хийх шаардлагатай бол:
# 1. Файлыг засварлах
# 2. Тестийг шинэчлэх
# 3. Коммит хийх

git add src/main/java/lab14/sict/must/edu/mn/Division.java
git add src/test/java/lab14/sict/must/edu/mn/DivisionTest.java
git commit -m "Тэгээр хуваахыг зохицуулсан division засвар"

# Push хийх
git push -u origin hotfix/v1.0.1

# PR үүсгэх:
# 1. hotfix/v1.0.1 -> release/v1.0.0
# 2. hotfix/v1.0.1 -> develop

# PR merge хийсний дараа tag үүсгэх
git checkout release/v1.0.0
git tag v1.0.1
git push origin v1.0.1
```

## 7. Main Салбарын Хамгаалалт Тохируулах

GitHub дээр:
1. Settings > Branches руу орох
2. "Add rule" дарж main салбарт дараахыг тохируулах:
   - ✅ Require a pull request before merging
   - ✅ Require status checks to pass before merging (CI Процесс сонгох)
   - ✅ Require branches to be up to date before merging
   - ✅ Do not allow bypassing the above settings

## 8. Merge Conflict Шийдвэрлэх

```bash
# Develop салбарыг feature салбарт нэгтгэх
git checkout feature/add-multiplication
git merge develop

# Хэрэв conflict гарвал:
# 1. Файлыг засварлаж conflict-ийг шийдэх
# 2. git add <файл>
# 3. git commit

# Push хийх
git push origin feature/add-multiplication
```

## 9. Локал Шалгалт

PR үүсгэхээс өмнө локал дээр дараах командуудыг ажиллуул:

```bash
# Тест ажиллуулах
mvn test

# Checkstyle шалгах
mvn checkstyle:check

# Coverage тайлан үүсгэх
mvn jacoco:report

# Coverage-ийг шалгах (target/site/jacoco/index.html)
open target/site/jacoco/index.html
```

## 10. Бүх Салбаруудыг Push Хийх

```bash
# Бүх салбаруудыг push хийх
git push origin main
git push origin develop
git push origin feature/add-multiplication
git push origin feature/add-division
git push origin release/v1.0.0
git push origin hotfix/v1.0.1

# Бүх tag-уудыг push хийх
git push origin v1.0.0
git push origin v1.0.1
```

