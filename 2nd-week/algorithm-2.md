## Chapter2. 기본 자료구조
### 2-1. 배열

#### 배열
배열은 다음과 같은 두 방식으로 선언 가능하다.
```
int[] a; // 형식 A
int a[]; // 형식 B
```
> 단순한 int 형이 아니라 int형인 배열임을 명확하게 나타내는 형식 A쪽이 더 많이 사용된다.

<br>배열의 자료형은 구분해서 사용하자.
```
int a = new int[5]
```
> a[0]는 int형, a는 int[5]형이다.

<br>

```
int[] a;           // 선언하기
a = new int[5];    // 참조하기
```
<br>각 형의 초깃값은 다음과 같다.

|형|초깃값|
|---|---|
|byte|(byte)0|
|short|(short)0|
|int|0|
|long|0L|
|float|0.0f|
|double|0.0d|
|char|'\u0000'|
|boolean|false|
|참조형|공백 참조 또는 null|
<br>

- 배열의 복제(클론)<br>

```
배열 이름.clone()      // 배열의 복제
```
<br>

- 메서드 사이에서 배열의 전달
```
void main(String[] args) {
    int[] height = new int[num];
    // ...
    maxOf(height)
    // ...
}
```
```
int maxOf(int[] a) {
    // ...
}
```
```
int[] a = height;     // 매개변수는 다음과 같이 초기화된다.
```
> main 메서드의 height와 메서드 maxOf의 a는 같은 배열 본체를 참조하게 된다.
> 즉, 메서드 maxOf에 전달하는 것은 '배열 본체에 대한 참조'이다.<br>

---
#### 접근 제한자란?
##### 1. 제한자 종류
- public : 모든 접근 허용
- protected : 같은 패키지(폴더)의 객체, 상속 관계의 객체 허용
- default : 같은 패키지(폴더)의 객체 허용
- private : 현재의 객체 안에서만 허용

##### 2. 접근 제한자 사용
- 클래스 : public, default
- 생성자 : public, protected, default, private
- 멤버 변수 : public, protected, default, private
- 멤버 메서드 : public, protected, default, private
- 지역 변수 : 접근 제한자를 사용할 수 없음
---

**Q. 멤버 변수, 멤버 메서드란??**

---
#### 컴퓨터에서 생성하는 난수는 진짜 난수가 아니다.
> 컴퓨터는 계산된 결과만 가지고 난수를 생성한다. 이 계산된 결과는 입력값에 의해 결정되므로
이 값으로 임의의 난수를 생성할 수는 없다(의사 난수).<br>
>따라서 seed 값을 항상 다르게 주기 위해서 **현재 시간**을 사용하는 것이 일반적이다.
