// 📄 clock.js - 실시간 시계 모듈

// 1. updateClock()
//    → 현재 시간(Date 객체)을 가져와 사용자 환경에 맞는 문자열로 변환 (예: "2025. 6. 24. 오후 6:34:12")
//    → id가 'clock'인 HTML 요소에 해당 문자열을 표시

// 2. setInterval(updateClock, 500)
//    → 500ms(0.5초)마다 updateClock()을 호출하여 시간 갱신

// 3. updateClock(); 
//    → 페이지 로드 직후에도 즉시 시간 1회 표시 (빈 값 방지용 초기 호출)

function updateClock() {
  const now = new Date();
  const formatted = now.toLocaleString();
  document.getElementById("clock").textContent = formatted;
}

setInterval(updateClock, 500);
updateClock(); // 최초 1회 실행
