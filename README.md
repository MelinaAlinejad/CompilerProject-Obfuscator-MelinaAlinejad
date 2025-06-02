# CompilerProject-Obfuscator-MelinaAlinejad
# مبهم‌ساز زبان C-Mini

## تکنیک‌های پیاده‌سازی شده
1. **تغییر نام متغیرها و توابع**  
   - جایگزینی نام‌ها با شناسه‌های بی‌معنا مانند `var1`, `func2`

2. **درج کد مرده**  
   - اضافه کردن متغیرهای بی‌استفاده (`int unused1 = 123;`)
   - اضافه کردن شرط‌های بی‌تاثیر (`if (0) { ... }`)

3. **درهم‌ریزی جریان کنترل**  
   - تبدیل ساختارهای `if` و `while` به `switch-case` با استفاده از `selector`

## نحوه اجرا
1. کامپایل پروژه:
input.mc
   int sum(int a, int b) {
    int result = a + b;
    return result;
}

int main() {
    int x = 3;
    int y = 4;
    int total = sum(x, y);
    printf("%d\n", total);
    return 0;
}

output.mc
int func1(int var1, int var2) {
    int unused1 = 123;
    if (0) { int unused2 = 456; }
    int var3 = (var1 + var2);
    return var3;
}

int main() {
    int var4 = 3;
    int var5 = 4;
    int selector = 1;
    while (selector > 0) {
        switch (selector) {
            case 1: 
                int var6 = func1(var4, var5);
                selector = 2;
                break;
            case 2: 
                printf("%d\n", var6);
                selector = 0;
                break;
        }
    }
    return 0;
}
[ملینا علی نژاد.pdf](https://github.com/user-attachments/files/20554068/default.pdf)
