## ✋ 과제 설명

디자인파트와 제플린을 사용해서 협업해보기!

![15](https://user-images.githubusercontent.com/31889335/69406346-41703a80-0d45-11ea-886f-fb86e77655af.PNG)

제플린을 사용하여 디자인 팀이 만들어 준 안드로이드 어플 UI를 보고, xml 레이아웃과 기능들을 구현해오기. 

<br>

## ✋ 중요 코드 설명

- 🍀 __수평 방향 리사이클러뷰 만들기__

    ![16](https://user-images.githubusercontent.com/31889335/69406752-27832780-0d46-11ea-952d-7ec936116465.PNG)

    > MainActivity.kt 참고

    리사이클러뷰의 __layoutManager__ 를 설정해줄 때 LinearLayoutManager 메소드의 매개변수에 __LinearLayoutManager.HORIZONTAL__ 를 추가해주면 된다!

    <br>

- 🍀 __똑같은 두 리사이클러뷰에서 Adapter 공유하기__

    위 제플린에서의 어플 UI를 보면 인기 금손 클래스 부분과 새로운 금손 클래스 부분의 itemView는 똑같은 것을 사용하고 있다.

    따라서, itemView.xml과 Adapter 클래스를 하나만 만들어 놓고 두 리사이클러뷰에서 함께 사용하면 된다. 그렇기 때문에 itemView를 정의해주는 ViewHolder도 하나만 만들면 된다.

    ![17](https://user-images.githubusercontent.com/31889335/69407207-55b53700-0d47-11ea-8651-269fbf791c71.PNG)

    위 코드를 보면 인기 금손 클래스의 리사이클러뷰와 새로운 금손 클래스의 리사이클러뷰 모두 GoldClassAdapter 클래스를 사용하고 있다.

    > MainActivity.kt 참고

    <br>

- 🍀 __리사이클러뷰에 이미지 데이터 넣기__

    안드로이드에서 이미지는 안드로이드 프로젝트 폴더 중 res 폴더 안의 drawable 폴더에 저장이 된다!

    그리고 drawable 폴더 안에 저장된 이미지는 코드 상에서 __R.drawable.파일이름__  으로 표현되는데 실제로 R.drawable.파일이름 자체는 __int형 정수 데이터__ 이다. 즉, drawble 폴더 안에 저장된 각 이미지 파일은 각각 유일한 정수형 숫자 데이터와 대응되는 것이다. 

    따라서 리사이클러뷰에 이미지가 사용되는 경우에는 data class를 만들 때 아래 코드와 같이 이미지뷰에 해당하는 변수의 자료형을 Int 형으로 지정해야 한다.

    ![18](https://user-images.githubusercontent.com/31889335/69408199-ab8ade80-0d49-11ea-8238-9e11d597c62d.PNG)

    > GoldClassItemData.kt 참고

    > 위 코드의 물음표 ? 는 itemView에 이미지 데이터를 넣지 않을 수도 있기 떄문에 null 처리를 해놓은 것 뿐이다!

    <br>

    그 다음, ViewHolder를 담당하는 클래스에서 bind 메소드를 정의할 때, __setImageResource()__ 라는 메소드를 사용하여 itemView의 ImageView에 실제 이미지를 연결해주는 코드를 작성해야 한다.

    ![19](https://user-images.githubusercontent.com/31889335/69408201-ac237500-0d49-11ea-8d0d-c4dda79a387a.PNG)

    > GoldClassViewHolder.kt 참고

    <br>

    마지막으로, 실제 데이터를 넣는 곳에서 data class에서 정의한 변수에 R.drawable.파일이름을 넣어주면 된다!

    R.drawable.파일이름이 결국 정수 데이터이기 때문에 data class에서 정의한 이미지 변수의 자료형인 Int형과 일치하게 된다.

    ![20](https://user-images.githubusercontent.com/31889335/69408200-ac237500-0d49-11ea-8b1b-c9bc18dd3539.PNG)

    > MainActivity.kt 참고

    <br>

- 🍀 __리사이클러뷰안의 각 item에 selector 적용하기__

    제플린에 있는 어플 UI를 보면 
    
    ![21](https://user-images.githubusercontent.com/31889335/69409508-6b792b00-0d4c-11ea-87eb-13b7d13f1f80.PNG)

    위와 같은 뷰가 있다. 
    
    하얀색 별을 클릭하면 해당 금손 클래스를 좋아요한 의미이고 클릭한 결과로 노란색 별로 바뀌어야 하는 뷰이다. 

    이런 작업은 selector로 뷰의 상태에 따라 이미지가 바뀌도록 만들어 놓고 적용하면 쉬운데 리사이클러뷰의 아이템에 selector를 적용하려니 조금 복잡했다!

    리사이클러뷰를 만들 때 사용되는 Adapter의 __onBindVeiwHolder()__ 메소드는 각 itemView의 position에 맞게 데이터를 연결해주는 역할을 할 때 사용하는 메소드이다. 즉, item 뷰의 positon 이 바뀔 때 마다 이 함수가 실행되는 것이다!

    > 사실 position이 바뀔 때마다 이 함수가 실행되는 것이라는 것은 내 생각이다.. 나중에 정확한 의미를 찾아보자!

    이 별모양 Selector도 각 item view마다 독립적으로 있어야 하는 기능이기 때문에 position마다 실행되는 onBindViewHolder() 메소드 안에 selector 관련 코드를 작성했다!

    ![22](https://user-images.githubusercontent.com/31889335/69411117-a7fa5600-0d4f-11ea-95b7-00872dafb1e8.PNG)

    > 파트장님께 이 코드 리뷰를 받았는데 checkedTextView를 사용하면 위 코드의 clickStar() 함수 자체가 필요하지 않다고 하셨다..!!! 
    >
    > 또, onBindViewHolder() 함수의 의미는 데이터를 연결시켜주는 곳이기 때문에 clickStar() 함수는 ViewHolder 클래스의 bind() 함수 안에 작성하는 것이 더 좋을 것 같다고 하셨다! 우와우~!!! 
    >
    > checkedTextView 라는게 있는 줄 몰랐는데 역시 찜찜한 내 코드는 꼭 리뷰를 받아야겠다!!





