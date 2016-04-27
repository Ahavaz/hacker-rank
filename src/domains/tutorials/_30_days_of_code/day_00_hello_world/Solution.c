#include <stdio.h>

int main() {
   char inputString[105];
   scanf("%[^\n]", inputString);

   printf("Hello, World.\n");

   printf("%s\n", inputString);

   return 0;
}
