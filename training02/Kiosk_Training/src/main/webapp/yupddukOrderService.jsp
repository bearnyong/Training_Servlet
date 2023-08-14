<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>떡볶이 주문</title>
</head>
<body>
    <h1>주문하기</h1>
    <h3>주문하실 옵션들을 선택하신 후 아래 '주문확인' 버튼을 클릭해 주세요.</h3>

    <form action="/yupdduk" method="post">
        <label><b>주문자 이름 : </b></label> <br>
        <input type="text" name="name">

        <br><br>
        <label><b>떡볶이 종류 선택 : </b></label><br>
        <input type="radio" name="kind" id="yupdduk" value="엽기떡볶이"><label for="yupdduk">엽기떡볶이(+14,000원)</label><br>
        <input type="radio" name="kind" id="rose" value="로제떡볶이"><label for="rose">로제떡볶이(+16,000원)</label><br>
        <input type="radio" name="kind" id="blacksouce" value="짜장떡볶이"><label for="blacksouce">짜장떡볶이(+17,000원)</label>

        <br><br>
        <label><b>떡볶이 맵기 선택 : </b></label><br>
        <input type="radio" name="spicy" id="level1" value="착한맛"><label for="level1">착한맛</label><br>
        <input type="radio" name="spicy" id="level2" value="초보맛"><label for="level2">초보맛</label><br>
        <input type="radio" name="spicy" id="level3" value="중간맛"><label for="level3">중간맛</label><br>
        <input type="radio" name="spicy" id="level4" value="오리지널"><label for="level4">오리지널</label><br>
        <input type="radio" name="spicy" id="level5" value="매운맛"><label for="level5">매운맛</label>

        <br><br>
        <label><b>떡볶이 토핑 선택 : </b></label><br>
        <input type="checkbox" name="topping" id="noodle" value="중국당면"> <label for="noodle">중국당면(+3,000원)</label><br>
        <input type="checkbox" name="topping" id="cheese" value="치즈"> <label for="cheese">치즈(+3,000원)</label><br>
        <input type="checkbox" name="topping" id="cheeseman" value="바싹치즈만두"> <label for="cheeseman">바싹치즈만두(+2,000원)</label><br>
        <input type="checkbox" name="topping" id="kimroll" value="김말이"> <label for="kimroll">김말이(+2,000원)</label><br>
        <input type="checkbox" name="topping" id="rice" value="주먹밥"> <label for="rice">주먹밥(+2,000원)</label><br>
        <input type="checkbox" name="topping" id="notopping" value="선택 안 함"> <label for="notopping">선택 안 함(+0원)</label>

        <br><br>
        <label><b>주문자 주소 : </b></label> <br>
        <input type="text" name="address">

        <br><br>
        <input type="submit" value="주문확인">
    </form>
</body>
</html>