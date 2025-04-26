<p align="center">
  <img src="assets/UIKIT_dark.png" alt="baekspace0" width="100%" />
</p>

# UIKIT
### 🎓대학교 맞춤형 툴킷
###### ( University Integrated Toolkit a.k.a. UIKIT )
#### One Line Described : 대학생들을 위한 다목적 통합 플랫폼 (Notion + Discord + 네이버카페 느낌)

## 📌 프로젝트 개요
- **프로젝트 이름**: 대학교 맞춤형 통합 툴킷 플랫폼 ( **UIKIT** )
- **목표**: 대학교 학생들이 학교 생활 전반을 효율적으로 관리하고 소통할 수 있는 올인원 시스템을 만든다.
- **타깃 사용자**: 대학교 재학생
- **제공 플랫폼**: Windows / iOS / Android
- **개발 인원**: 1명 (본인)
- **개발 기간**: 미정 (장기적 학습 및 개발 목표)

## 🧠 핵심 기능 정의

### 1. 학사 일정 관리

- 학사일정 자동 크롤링 / 관리자가 등록
- 시험/과제/공지/수업 변경 알림 → 내부 캘린더에 자동 반영
- 개인 일정과 학사 일정의 통합 관리 가능
- 교내에서 열리는 다양한 행사 및 이벤트 일정 공유

### 2. 시간표 관리

- 개인 시간표 등록 및 공강 자동 분석
- 친구와 시간표 공유 / 공통 시간 확인
- 행사 일정과 자동 연동

### 3. 교내 식당 메뉴

- 식단표 자동 크롤링 또는 수동 업데이트
- 메뉴 평가 / 댓글 / 알림

### 4. 중고 거래 / 재능 공유 / 알바 정보

- 인증 기반 안전 거래 시스템
- 재능 공유 게시판 (디자인, 코딩 등)
- 리뷰 기반 평판 시스템

### 5. 통합 커뮤니티 및 실시간 소통

- 게시판 (익명/일반)
- 실시간 채팅 및 음성채팅 (Discord 스타일)
- DM / 친구 추가 기능

### 6. 스터디 매칭 & 도서관 시스템

- 과목 기반 자동 매칭 / 수동 모집
- 자료 공유 / 그룹 캘린더
- Zoom, Google Meet 연동

### 7. 강의평가 / 수업 리뷰

- 강의/교수 리뷰 등록 및 열람
- 수강신청 참고 정보 제공

## 🔧 기술 스택 (예상)

- **프론트엔드**: Next.js, React Query, Zustand, Tailwind CSS
- **백엔드**: Node.js(NestJS), FastAPI(Python), Spring Boot(Java/Kotlin)
- **데이터베이스**: Node.js(NestJS), FastAPI(Python), Spring Boot(Java/Kotlin) / MySQL / Firebase
- **인증 시스템**: 학교 이메일 인증 + 일반 로그인
- **알림**: Firebase Cloud Messaging / WebSocket
- **배포**: Vercel / Netlify / Heroku / AWS
- 기타: WebSocket([Socket.IO](http://socket.io/)), OpenAI API, JWT, OAuth
