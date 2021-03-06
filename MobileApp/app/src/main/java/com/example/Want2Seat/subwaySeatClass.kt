package com.example.subwayseat

data class seatInfo (
    var userid:String?,
    var status:Int?,
    var dst:String?
)

data class userInfo(
    var email:String?,
    var name:String?
)

data class location(
    var location1:Int?,
    var location2:Int?
)



// station index에 없는 역 존재 : 고지
val STATION_INDEX = hashMapOf("당고개" to 0, "상계" to 1, "노원" to 2, "창동" to 3, "쌍문" to 4, "수유" to 5, "미아" to 6, "미아사거리" to 7, "길음" to 8, "성신여대입구" to 9, "한성대입구" to 10, "혜화" to 11, "동대문" to 12, "동대문역사문화공원" to 13, "충무로" to 14, "명동" to 15, "회현" to 16, "서울" to 17, "숙대입구" to 18, "삼각지" to 19, "신용산" to 20, "이촌" to 21, "동작" to 22, "총신대입구(이수)" to 23, "사당" to 24, "남태령" to 25, "선바위" to 26, "경마공원" to 27, "대공원" to 28, "과천" to 29, "정부과천청사" to 30, "인덕원" to 31, "평촌" to 32, "범계" to 33, "금정" to 34, "산본" to 35, "수리산" to 36, "대야미" to 37, "반월" to 38, "상록수" to 39, "한대앞" to 40, "중앙" to 41, "고잔" to 42, "초지" to 43, "안산" to 44, "신길온천" to 45 ,"정왕" to 46, "오이도" to 47)
val STATION_LIST = STATION_INDEX.keys

//x축 간격 약 70f~80f
val STATION_LOCATION_X = hashMapOf("당고개" to 90f, "상계" to 170f, "노원" to 250f, "창동" to 330f,
    "쌍문" to 410f, "수유" to 490f, "미아" to 565f, "미아사거리" to 640f, "길음" to 720f, "성신여대입구" to 800f,
    "한성대입구" to 885f, "동작" to 60f, "이촌" to 135f, "신용산" to 215f, "삼각지" to 280f, "숙대입구" to 350f,
    "서울" to 420f, "회현" to 500f, "명동" to 580f, "충무로" to 660f, "동대문역사문화공원" to 740f, "동대문" to 820f,
    "혜화" to 890f, "총신대입구(이수)" to 60f, "사당" to 135f, "남태령" to 210f, "선바위" to 270f, "경마공원" to 345f,
    "대공원" to 415f, "과천" to 480f, "정부과천청사" to 560f, "인덕원" to 630f, "평촌" to 705f, "범계" to 770f, "금정" to 850f,
    "산본" to 915f, "오이도" to 90f, "정왕" to 170f, "신길온천" to 240f, "안산" to 310f, "초지" to 380f, "고잔"
            to 450f,
    "중앙" to 530f, "한대앞" to 600f, "상록수" to 660f, "반월" to 730f, "대야미" to 805f, "수리산" to 875f)

val STATION_LOCATION_Y = hashMapOf("당고개" to 200f, "상계" to 200f, "노원" to 200f, "창동" to 200f,
    "쌍문" to 200f, "수유" to 200f, "미아" to 200f, "미아사거리" to 200f, "길음" to 200f, "성신여대입구" to 200f,
    "한성대입구" to 200f, "동작" to 465f, "이촌" to 465f, "신용산" to 465f, "삼각지" to 465f, "숙대입구" to 465f,
    "서울" to 465f, "회현" to 465f, "명동" to 465f, "충무로" to 465f, "동대문역사문화공원" to 465f, "동대문" to 465f,
    "혜화" to 465f, "총신대입구(이수)" to 700f, "사당" to 700f, "남태령" to 700f, "선바위" to 700f, "경마공원" to 700f,
    "대공원" to 700f, "과천" to 700f, "정부과천청사" to 700f, "인덕원" to 700f, "평촌" to 700f, "범계" to 700f, "금정" to 700f,
    "산본" to 700f, "오이도" to 890f, "정왕" to 890f, "신길온천" to 890f, "안산" to 890f, "초지" to 890f, "고잔" to 890f,
    "중앙" to 890f, "한대앞" to 890f, "상록수" to 890f, "반월" to 890f, "대야미" to 890f, "수리산" to 890f)