/**
 * CLIENT
 */


$(document).ready(function(){

    backGroundChange()

})

function menuChange(menu1, menu2, menu3, menu4, menu5){

    let header = document.querySelector("#cHeader");

    console.log("[header ==> ]", header);

    header.children[0].innerHTML = menu1;
    header.children[1].innerHTML = menu2;
    header.children[2].innerHTML = menu3;
    header.children[3].innerHTML = menu4;
    header.children[4].innerHTML = menu5;


}

/** 사이드바의 메뉴 클릭 시 해당 메뉴에 대한 배경이미지와 URL 변경 설정 */
function backGroundChange() {
    // 사이드바의 a 요소 클릭 이벤트 추가
    $(".sideBar a").click(function(e){
        e.preventDefault();

        // 클릭된 a 요소의 href 속성 값
        const href = $(this).attr("href");

        // href 속성 값에 따라 배경 이미지 클래스 이름 설정
        let bgClass;
        switch (href) {
            case "/proFile":
                bgClass = "proFileBackGround";
                break;
            case "/portFolio":
                bgClass = "portFolioBackGround";
                break;
            case "/game":
                bgClass = "gameBackGround";
                break;
            // 필요한 만큼 case 추가
            default:
                bgClass = "";
                break;
        }

        // body 요소에 배경 이미지 클래스 추가
        $("body").removeClass().addClass(bgClass);

        // URL 변경
        history.pushState(null, null, href);

        return false; // 기본 동작(링크 이동) 방지
    });

    // 페이지가 로드될 때 URL에 따라 배경 이미지 설정
    const href = window.location.pathname;

    // href 속성 값에 따라 배경 이미지 클래스 이름 설정
    let bgClass;
    switch (href) {
        case "/proFile":
            bgClass = "proFileBackGround";
            break;
        case "/portFolio":
            bgClass = "portFolioBackGround";
            break;
        case "/game":
            bgClass = "gameBackGround";
            break;
        case "/https://www.youtube.com/channel/UCHC0mo3JMGpzGeV_mLKQ9ug":
            break;
        // 필요한 만큼 case 추가
        default:
            bgClass = "";
            break;
    }

    // body 요소에 배경 이미지 클래스 추가
    $("body").removeClass().addClass(bgClass);
}
