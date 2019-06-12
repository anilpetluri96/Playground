#include<stdio.h>
int main()
{
  int num;
  int t,o,result;
  scanf("%d",&num);
  t=num/100;
  o=num%10;
  result=t+o;
  printf("%d",result);
  //Type your code here
  return 0;
}