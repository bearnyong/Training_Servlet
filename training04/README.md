# Servlet_CRUD_test
<p>
TBL_MENU 테이블을 이용한 crud 테스트
</p>


## 문제
교소도에서 출소한 장췐이 정신을 차리고 마라탕 집을 오픈하고자 한다.<br/>
장췐은 그동안 모은돈이 조금 있어서 메뉴관리 시스템을 만들고자 하는데<br/>
자신의 달라진 모습을 사람들에게 보여주고 싶어한다.<br/><br/>
마라탕 집의 이름은 "니하오 마라탕"이며<br/>
매인 베너에는 "자신의 사진"이 들어갔으면 좋겠다고 한다.<br/>
처음 메인 페이지에서는 nav 메뉴를 보여주고자 하며 구성은 다음과 같다.<br/><br/>

>1. 전체 메뉴 조회 (판매중인 것 만) 조회화면에는 메뉴이름, 가격만 보여준다.<br/>
>2. 단일 메뉴 상세 조회(판매 중이 아닌 것 포함 메뉴의 모든 정보를 보여준다.) 상세 정보에는 카테고리명도 보여준다.<br/>
>3. 메뉴 수정 (메뉴의 판매 여부 및 가격을 수정한다.)<br/>
>4. 메뉴 삭제( 메뉴의 판매 중지 상태로 변경)<br/>
>5. 메뉴 등록<br/>
>> 3, 4, 5 작업이 완료되면 전체메뉴 조회 페이지로 이동을 시킨다.


## TBL_MENU 테이블
MENU_CODE           [메뉴코드(ex. 1 (시퀀스 이용))]<br/> 
MENU_NAME           [메뉴명(ex. 마라탕)]<br/>
MENU_PRICE          [메뉴가격(ex. 45000)]<br/>
CATEGORY_CODE       [카테고리코드(ex. 5(중식))]<br/>
ORDERABLE_STATUS    [주문가능상태(ex. Y)]<br/>


## TBL_CATEGORY 테이블
CATEGORY_CODE       [카테고리코드(ex. 1 (TBL_MENU 테이블 JOIN))]<br/>
CATEGORY_NAME       [카테고리명(ex. 중식)]<br/>
REF_CATEGORY_CODE   [상위카테고리코드]<br/>


## 분석
1. 마라탕집 이름 : 니하오 마라탕
2. 메인 배너 : 장첸 사진 포함
3. 메인 페이지 : nav메뉴(https://pridiot.tistory.com/15)
4. 화면구성<br/>
4.1. 전체 메뉴 조회하기 - WHERE ORDERABLE_STATUS가 'Y'인 상태만 출력, 메뉴명(MENU_NAME)과 가격(MENU_PRICE) 조회 <br/>
4.2. 단일 메뉴 조회하기 - 판매상태(ORDERABLE_STATUS) 구분없이 메뉴의 모든 정보 조회 + 카테고리명(join)<br/>
4.3. 메뉴 수정하기 - 메뉴의 판매상태(ORDERABLE_STATUS) 및 가격(MENU_PRICE) 수정<br/>
4.4. 메뉴 삭제하기 - 메뉴의 판매상태(ORDERABLE_STATUS)를 'N'으로 변경<br/>
4.5. 메뉴 등록하기
5. 메뉴 수정, 삭제, 등록 후 전체 메뉴 조회 페이지로 이동한다.
