<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>후라이드 참 잘하는 집</title>
</head>
<body>
    <h1>주문하기</h1>
    <h4>주문하실 옵션들을 선택하신 후 아래 '주문' 버튼을 클릭해 주세요.</h4>
    <form action="nonmembersession/chickenorder" method="get">
        <dev>
            <label><b>▶▶▶메뉴선택 </b></label><br/>
            <label>----------------------------------------------------</label><br>
            <select name="menu">
                <option value="킹트리플양념치킨">[new] 킹트리플양념치킨(+17,000원)</option>
                <option value="후라이드치킨">[best] 후라이드치킨(+15,000원)</option>
                <option value="양념치킨">[best] 양념치킨(+16,000원)</option>
                <option value="간장치킨">간장치킨(+16,000원)</option>
                <option value="핫토스치킨">핫토스치킨(+16,000원)</option>
                <option value="허니버터치킨">허니버터치킨(+16,000원)</option>
                <option value="눈꽃치즈치킨">눈꽃치즈치킨(+16,000원)</option>
                <option value="디진다핫치킨">디진다핫치킨(+17,000원)</option>
            </select>
        </dev>
        <dev>
            <br><br>
            <label><b>▶▶▶사이드 메뉴 선택</b></label><br/>
            <label>----------------------------------------------------</label><br>
            <input type="checkbox" name="topping" id="sotteok" value="소떡소떡"> <label for="sotteok">소떡소떡(2개)(+2,500원)</label><br>
            <input type="checkbox" name="topping" id="cheeseball" value="치즈볼(4개)"> <label for="cheeseball">치즈볼(4개)(+3,000원)</label><br>
            <input type="checkbox" name="topping" id="hotdog" value="눈꽃치즈핫도그"> <label for="hotdog">눈꽃치즈핫도그(4개)(+4,000원)</label><br>
            <input type="checkbox" name="topping" id="fries" value="감자튀김"> <label for="fries">감자튀김(+6,000원)</label><br>
            <input type="checkbox" name="topping" id="cheesefries" value="눈꽃치즈감자튀김"> <label for="cheesefries">눈꽃치즈감자튀김(+7,000원)</label><br>
            <input type="checkbox" name="topping" id="notopping" value="선택 안 함"> <label for="notopping">선택 안 함(+0원)</label>
        </dev>
        <dev>
            <br><br>
            <label><b>▶▶▶리뷰이벤트</b></label><br/>
            <label>----------------------------------------------------</label><br>
            <input type="radio" name="review" id="coke" value="리뷰_콜라500ml"><label for="coke">콜라500ml</label>
            <input type="radio" name="review" id="radish" value="리뷰_치킨무"><label for="radish">치킨무</label>
            <input type="radio" name="review" id="poteto" value="리뷰_감자튀김"><label for="poteto">감자튀김</label>
            <input type="radio" name="review" id="noreview" value="리뷰_선택 안 함"><label for="noreview">선택 안 함</label>
        </dev>
        <br><br><input type="submit" value="주문">
    </form>
</body>
</html>