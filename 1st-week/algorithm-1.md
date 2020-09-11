1-2 반복
---
- while 문 반복(28p) : <br>
실행 전에 반복을 계속할지 판단하므로, 사전 판단 반복 구조라고 한다. <br>

- for 문 반복(29p) : <br>
하나의 변수를 사용하는 반복문은 while 문보다 for 문을 사용하는 것이 좋다. <br><br>
for 문의 형식은 다음과 같다. <br>
`for (초기화 부분; 제어식; 업데이트 부분) 명령문` <br> <br>

- do while 문(33p) : <br>
사후 판단 반복문인 do 문은 루프 본문이 반드시 한번 실행된다. <br>

Q. 왜 다음과 같이 do while문을 작성하면 에러가 나는 것일까?
```
do {
    System.out.print("b의 값: ");
    int bValue = scanner.nextInt();
} while (bValue > aValue); // bValue에 밑줄 쳐짐.
```

Q10 문제의 더 좋은 코드 예시?


 