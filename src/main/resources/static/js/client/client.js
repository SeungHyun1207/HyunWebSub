/**
 * CLIENT
 */


$(document).ready(function(){

    // backGroundChange()

    // 오늘의 명언
    todayQuote();
    
    // 페이지스크롤
    pageScroll();

})


function pageScroll(){


}

/** 오늘의 명언 **/
function todayQuote(){

    /* 한글명언 */
    let quoteList = [
        "인생에서 많은 패배에 직면하겠지만 결코 패배하지 말라. – 마야 안젤루",
        "인생에서 가장 큰 영광은 넘어지지 않는 것에 있는 것이 아니라 매번 일어선다는 데 있다. – 넬슨 만델라",
        "성공이란 실패에 실패를 거듭하면서도 열의를 잃지 않는 것이다. -윈스턴 처칠",
        "스스로 자신을 돕지 않는 사람은 아무리 도와봐야 소용이 없다. 스스로 올라가려고 하지 않는 사람을 밀어서 사다리 위로 올려 보낼 수는 없는 법이니까. -앤드류 카네기",
        "성공한 사람이 되려고 애쓰지 말고, 가치 있는 사람이 되려 애써라. -아인슈타인",
        "우리의 최대의 약점은 포기다. 성공으로 가는 가장 확실한 방법은 언제든지 한번 더 시도해보는 것이다. – 토마스 에디슨",
        "무언가를 시작하고 실패하는 것보다 더 나쁜 것은…아무것도 시작하지 않는 것이다. – 세스 고딘"
    ];

    /* 영문명언 */
    let enQuoteList = [
        "You will face many defeats in life, but never let yourself be defeated. – Maya Angelou",
        "The greatest glory in living lies not in never falling, but in rising every time we fall. – Nelson Mandela",
        "Success is going from failure to failure without a loss of enthusiasm. -Winston Churchill",
        "There is no use whatever trying to help people who do not help themselves. You cannot push anyone up a ladder unless he be willing to climb himself. -Andrew Carnegie",
        "Try not to become a man of success but rather try to become a man of value. -Albert Einstein",
        "Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time. – Thomas Edison",
        "The only thing worse than starting something and failing … is not starting something. – Seth Godin"
    ]

    // 랜덤 명언
    function getRandomQuote(){
        let randomIndex = Math.floor(Math.random() * quoteList.length);
        return quoteList[randomIndex];
    }

    // 표시
    let quote = document.getElementById("todayQuote");
    quote.textContent = getRandomQuote();

}

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
let bodyClasses = ""; // body 요소에 추가된 클래스들을 저장할 변수
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

        // body 요소에 이전에 추가된 클래스들과 함께 배경 이미지 클래스 추가
        $(".bodyBackGround").removeClass(bodyClasses).addClass(bgClass);
        bodyClasses = bgClass; // bodyClasses 변수를 업데이트

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
    $(".bodyBackGround").addClass(bgClass);
    bodyClasses = bgClass; // bodyClasses 변수를 업데이트
};