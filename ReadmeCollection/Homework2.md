# ✋ 과제 설명

[Homework1](https://github.com/choheeis/SOPT_25/blob/master/README_collection/Homework1_readme.md) 에서 만든 프로젝트와 병합하여 로그인 시 

![09](https://user-images.githubusercontent.com/31889335/69004918-b87c8c00-095d-11ea-9985-de53be393036.PNG)

이 화면으로 이동해야 한다.

그 다음, 이 화면에서 보이는 리사이클러뷰의 각 item을 클릭하면 

![10](https://user-images.githubusercontent.com/31889335/69004956-4d7f8500-095e-11ea-853d-77037bb54d57.PNG)

다음과 같은 화면으로 이동시켜야 한다. 

즉, 맨 처음 보이는 리사이클러뷰는 내 깃허브 계정을 팔로우한 팔로워들이고, 두 번째로 보이는 리사이클러뷰는 각 계정들의 레포지토리를 보여주는 뷰이다.


<br>

# ✋ 중요 코드 설명

- 🐣 __리사이클러뷰 안의 item 클릭 리스너 (클릭시 다른 화면으로 전환되게 하기)__

    ![11](https://user-images.githubusercontent.com/31889335/69005065-c6331100-095f-11ea-8c64-ab6ee0f8fd8e.PNG)

    리사이클러뷰의 Adapter 클래스 안에 있는 __onBindViewHolder__ 함수 안에서 setOnClickListener을 호출하면 된다.

    이 때, 변수 itemView는 ViewHolder 클래스인 FollowerViewHolder 클래스에서 선언한 View 변수이다!

    <br>

- 🐣 __어플 전체에 액션바 없애기__

    매니페스트 파일을 들어가면 __\<application>__ 의 속성으로 android:theme 이라는 부분이 있다. 

    ![12](https://user-images.githubusercontent.com/31889335/69405335-b9893100-0d42-11ea-9608-aafc8428c334.PNG)


    이 부분은 어플리케이션의 테마를 결정해주는 부분인데 속성값으로 @style/AppTheme 이라고 되어있는 것을 볼 수 있다.

    즉, res 폴더 안의 values 폴더 안에 있는 style.xml 파일에서 AppTheme 라는 이름으로 된 style을 어플의 테마로 지정하겠다는 의미이다. 

    프로젝트를 새로 만들었을 때 style.xml 파일을 들어가보면 style 속성의 기본값으로 
    
    ![13](https://user-images.githubusercontent.com/31889335/69405572-5f3ca000-0d43-11ea-899a-c13ffe92133e.PNG)

    라고 되어 있는 것을 볼 수 있다. 이 부분을

    ![14](https://user-images.githubusercontent.com/31889335/69405573-5fd53680-0d43-11ea-9628-e637cdc355ab.PNG)

    에서 볼 수 있듯이 DarkActionbar을 NoActionBar로 바꿔주면 된다!
