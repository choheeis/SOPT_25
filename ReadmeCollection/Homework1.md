## ✋ 과제 설명

![01](https://user-images.githubusercontent.com/31889335/66187247-545c7c00-e6bf-11e9-91cd-da63df3f648d.PNG)

![02](https://user-images.githubusercontent.com/31889335/66187336-8a016500-e6bf-11e9-986a-e50dbedbbfc7.PNG)

![03](https://user-images.githubusercontent.com/31889335/66187335-8a016500-e6bf-11e9-9b5c-197f9fc70a37.PNG)

![04](https://user-images.githubusercontent.com/31889335/66187333-8968ce80-e6bf-11e9-867d-b2270281e605.PNG)

<br>

## ✋ 코드 설명

- _회원가입 버튼 클릭시 회원가입 엑티비티로 화면 전환하기_

    ![05](https://user-images.githubusercontent.com/31889335/66187579-05fbad00-e6c0-11e9-8a90-1d3192f94fd6.PNG)

    ![08](https://user-images.githubusercontent.com/31889335/66187794-8d492080-e6c0-11e9-95f0-5cd221223f1a.PNG)

    intent로 화면을 전환하되, 다시 데이터를 받아오기 위해 __startActivityResult__ 함수로 넘김

    SIGNUP_REQUEST 변수는 request 변수로 아무 상수값을 사용하면 됨 -->  SIGNUP_REQUEST 변수로 설정한 상수값을 요청 변수로 사용하겠다는 것!

    <br>

- _회원가입 엑티비티에서 id, password 정보를 로그인 엑티비티로 넘기기_

    ![06](https://user-images.githubusercontent.com/31889335/66187580-05fbad00-e6c0-11e9-959e-0fa1ed64daf5.PNG)

    __putExtra__ 함수로 데이터를 넘기고, __setResult__ 함수를 사용해서 result 코드와 함께 넘김

    <br>

- _로그인 엑티비티에서 회원가입 엑티비티로부터 데이터 받기_

    ![07](https://user-images.githubusercontent.com/31889335/66187581-05fbad00-e6c0-11e9-941f-05277dc2069e.PNG)

    request 변수와 result 변수를 조건으로 어느 엑티비티에서 넘긴 데이터인지 판단하면 됨

    > 끝~





