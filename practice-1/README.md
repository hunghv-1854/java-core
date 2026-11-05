# Practice 1 – OOP: Kế thừa & Đa hình

## Yêu cầu
- `Shape` có `width`, `height`.
- `Rectangle extends Shape`: `getArea()` = w*l, `getPerimeter()` = 2(l+w).
- `Circle extends Shape`: `getArea()` = πr², `getCircumference()` = d*3.14.
- Mở rộng: `Square extends Rectangle`.

## Cấu trúc
```
src/com/example/
├── Main.java            # Khởi tạo đối tượng & in thông tin
└── shape/
    ├── Shape.java       # Lớp cha abstract (width, height, getArea() abstract)
    ├── Rectangle.java   # w*l, 2(l+w)
    ├── Circle.java      # width = height = đường kính
    └── Square.java      # Rectangle có 2 cạnh bằng nhau
```

## Chạy
```bash
cd practice-1
docker build -t practice-1 .
docker run --rm practice-1
```
Không dùng Docker (cần JDK 25):
```bash
javac -d out $(find src -name "*.java") && java -cp out com.example.Main
```
