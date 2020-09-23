## 3. 검색
### 3-2. 선형검색
#### 보초법
보초는 반복문에서 종료 판단 횟수를 절반으로 줄이는 역할을 한다.
### 3.3 이진 검색
이진 검색을 적용하는 전제 조건은 데이터가 키 값으로 이미 정렬(sort)되어 있다는 것이다.<br>
이진 검색은 선형 검색보다 좀 더 빠르게 검색할 수 있다는 장점이 있다.
#### 복잡도
프로그램의 실행 속도는 프로그램이 동작하는 하드웨어나 컴파일러 등의 조건에 따라
달라진다. <br> 알고리즘의 성능을 객관적으로 평가하는 기준을 복잡도(complexity)
라고 한다.<br> 복잡도는 다음과 같은 두 가지 요소를 갖는다.
- 시간 복잡도(time complexity) : 실행에 필요한 시간을 평가한 것
- 공간 복잡도(space complexity) : 기억 영역과 파일 공간이 얼마나 필요한가를 평가한 것
> n/2번 실행했을 때 복잡도를 O(n/2)가 아닌 O(n)으로 표현하는 이유는 n의 값이
> 무한히 커진다고 가정했을 때, 그 값의 차이가 무의미해진다.<br>
>> 복잡도를 표기할 때 사용하는 O는 Order에서 따온 것으로, 
O(n)은 'O-n', 'Order n', 'n의 Order'라고 읽는다.

O(f(n))과 O(g(n))의 복잡도를 계산하는 방법은 아래와 같다.
>O(f(n))+O(g(n)) = O(max(f(n), g(n)))

2개 이상의 복잡도로 구성된 알고리즘의 전체 복잡도는 차원이 더 높은 쪽의
복잡도를 우선시한다.<br>
<br>
##### String.format()과 printf()의 활용
```
System.out.println(String.format("%d", 3));         // "3"
System.out.println(String.format("%s", "*"));       // "*"
System.out.println(String.format("%%"));            // "%"
System.out.println(String.format("%%%ds", 3))       // "%3s"

// String.format()과 printf()의 조합
System.out.printf(String.format("%%%ds", 3), "*")   // "  *"
```

##### ++의 활용
```
// 1번
Array[count] = num;
count++;

// 2번
Array[count++] = num;

// 1번과 2번의 결과는 동일하다.
```