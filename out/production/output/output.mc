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