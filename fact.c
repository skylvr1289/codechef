#include<stdio.h>
#define s(n) scanf("%d",&n)
#define pd(n) printf("%d\n",n)
#define ps(s) printf("%s\n",s)
 
int main(){
int t,n;
int i;
s(t);
for(i=0;i<t;i++){
     s(n);
    int count=0;
    while(n>0){
        count+=n/5;
        n=n/5;
    }
    pd(count);
}
return 0;
}
 