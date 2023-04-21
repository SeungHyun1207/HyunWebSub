/** ajax실행 결과 error발생 시 alert으로 나타내기 */
function getErrorMsg(jqXHRStatus) {
    if (jqXHRStatus === 400) {
        alert('잘못된 요청입니다. 관리자에게 문의해주세요.');
    }
    if (jqXHRStatus === 401) {
        alert('접근 권한이 없습니다. 로그인 정보를 확인해주세요.');
        location.reload();
    }
    if (jqXHRStatus === 403) {
        alert('접근 권한이 없습니다. 로그인 정보를 확인해주세요.');
    }
    if (jqXHRStatus === 404) {
        alert('페이지를 찾을 수 없습니다.');
    }
    if (jqXHRStatus === 405) {
        alert('리소스를 허용할 수 없습니다.');
    }
    //DB관련 Test Connection용(hiveGroup.js)
    if (jqXHRStatus === 422) {
        alert('데이터베이스 커넥션 정보가 유효하지 않습니다.');
    }
    if (jqXHRStatus === 500) {
        alert('내부서버 오류입니다.');
    }
}
