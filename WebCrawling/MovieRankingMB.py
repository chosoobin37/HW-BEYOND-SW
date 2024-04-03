import requests
import pandas as pd

def get_movie_rankings():
    # 메가박스 API 엔드포인트 URL
    url = "https://www.megabox.co.kr/pages/movie/Movie.jsp"

    # API 요청 보내기
    response = requests.get(url)

    # 응답의 JSON 데이터 가져오기
    data = response.json()

    # JSON 데이터에서 영화 정보 추출
    movies = data['movieList']
    movie_titles = [movie['movieNM'] for movie in movies]
    reservation_rates = [movie['bookingRate'] for movie in movies]

    # 데이터프레임 생성
    movie_df = pd.DataFrame({
        '영화 제목': movie_titles,
        '예매율': reservation_rates
    })

    return movie_df

# 메가박스 실시간 영화 순위 가져오기
megabox_rankings = get_movie_rankings()
print(megabox_rankings)
