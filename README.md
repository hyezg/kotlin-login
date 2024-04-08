# kotlin-login
### 과제 : Android 앱개발 입문 개인과제 (24.03.25~24.03.28)<br>

## 목차
[Lv2. 회원가입 페이지 만들기](#lv2-회원가입 페이지 만들기-:-signupactivity)

  
### [필수 구현 사항]
#### Lv1. 로그인 페이지 만들기 : SignInActivity

<img src="https://file.notion.so/f/f/83c75a39-3aba-4ba4-a792-7aefe4b07895/0c6a4555-4bf6-47c8-96a1-635684c471a4/Screenshot_20230727_004902.png?id=0c6a684a-3e11-4d0f-a10f-dd3d8014fc0b&table=block&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&expirationTimestamp=1711526400000&signature=B7FN5Fk6rGvScMgKRFvIbQf2outzO3b0Jyuwtd-6NdA&downloadName=Screenshot_20230727_004902.png" width="20%">

- [x] 새 프로젝트를 만들고 MainActivity의 이름을 SignInActivity로 바꿔주세요.
- [x] 로고 이미지는 원하는 이미지로 넣어주세요.
- [x] 아이디, 비밀번호를 입력 받는 EditText를 넣어주세요.(미리보기 글씨(플레이스 홀더) 포함)
- [x] 비밀번호 EditText는 입력 내용이 가려져야 합니다.(●●● 처리)
- [x] 로그인 버튼을 누르면 HomeActivity가 실행되도록 구현합니다.
(Extra로 아이디를 넘겨줍니다.)
- [x] 아이디/비밀번호 모두 입력 되어야만 로그인 버튼이 눌리도록 구현합니다.
(“로그인 성공”이라는  토스트 메세지 출력하도록 구현)
- [x] 아이디/비밀번호 중 하나라도 비어 있다면 "아이디/비밀번호를 확인해주세요” 라는 토스트 메세지가 출력되도록 구현합니다.
- [x] 회원가입 버튼을 누르면 SignUpActivity가 실행되도록 구현합니다.


#### Lv2. 회원가입 페이지 만들기 : SignUpActivity

<img src="https://file.notion.so/f/f/83c75a39-3aba-4ba4-a792-7aefe4b07895/84860e3e-ec4a-4845-a036-d526dbe61107/Untitled.png?id=408b1391-35a6-4fb4-a5f2-3d13ff97e576&table=block&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&expirationTimestamp=1711526400000&signature=Bh3X-BA3hXixPKl3d68mONGQAhsBBl7C7D8y7xLdTAE&downloadName=Untitled.png" width="20%">

- [x] SignpActivity를 생성해 주세요.
- [x] 타이틀 이미지는 원하는 이미지로 넣어주세요.
- [x] 이름, 아이디, 비밀번호 모두 입력 되었을 때만 회원가입 버튼이 눌리도록 구현합니다.
- [x] 셋 중 하나라도 비어있으면 “입력되지 않은 정보가 있습니다” 라는 토스트 메세지를 출력하도록 구현합니다.
- [x] 비밀번호 EditText는 입력 내용이 가려져야 합니다.(●●● 처리)
- [x] 회원가입 버튼이 눌리면 SignInActivity로 이동하도록 구현합니다. (finish 활용)


#### Lv3. 자기소개 페이지 만들기 : HomeActivity

<img src="https://file.notion.so/f/f/83c75a39-3aba-4ba4-a792-7aefe4b07895/719af862-e1c9-443d-a737-776257a89aa9/Screenshot_20230727_004821.png?id=4602feec-57db-419e-a565-4afc8a0e00d0&table=block&spaceId=83c75a39-3aba-4ba4-a792-7aefe4b07895&expirationTimestamp=1711526400000&signature=lYS5KADDcstx-YBg9HQbXxKJ8BjtOctc7-lPJqEPOLc&downloadName=Screenshot_20230727_004821.png" width="20%">

- [x] HomeActivity를 생성해 주세요.
- [x] SignInActivity에서 받은 extra data(아이디)를 화면에 표시합니다.
- [x] ImageView, TextView 외에 각종 Widget을 활용해 자유롭게 화면을 디자인 해주세요.
    - [x] 이름, 나이, MBTI 등 자기소개등이 들어가는 위젯을 자유롭게 디자인해주세요.
- [x] 종료 버튼이 눌리면 SignInActivity로 이동하도록 구현합니다. (finish 활용)
---
### [필수 구현 완성]
SingIn - SingUp - Home <br>
<img src="https://github.com/hyezg/kotlin-login/assets/112006114/22961c87-0970-4066-9936-dc07d1d03efe" width="20%">
<img src="https://github.com/hyezg/kotlin-login/assets/112006114/437c5d38-c507-4b8f-8f6a-462955dcac0b" width="20%">
<img src="https://github.com/hyezg/kotlin-login/assets/112006114/3815eba7-fe42-44a2-99be-21e0dc127603" width="20%">

---
### [선택 구현 사항]
#### 1. 화면 이동 후 자동 입력 구현 (hint:registerForActivityResult)


#### 2. 자기 소개 랜덤 사진

---

#### 해설영상 본 후 리팩토링 할 것
- [ ] 하드코딩한거 string에 넣어서 id꺼내서 쓰기
- [ ] 버튼 누르면 색 바뀌도록
- [ ] 버튼에 체인으로 이모지랑 텍스트 넣기
- [ ] 버튼의 이모지 누르면 이모지 바뀌기
- [ ] 선택구현2 - when사용해서 간단하게하기
- [ ] 선택구현1 따라서 해보기
