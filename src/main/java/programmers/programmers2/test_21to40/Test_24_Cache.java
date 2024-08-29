package programmers.programmers2.test_21to40;

import java.util.LinkedList;
import java.util.List;

public class Test_24_Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new LinkedList<>();

        // 캐시의 크기가 0일 경우 전부 cache miss
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        // 캐시의 크기가 0이 아닐 경우
        for (int i = 0; i < cities.length; i++) {
            // 도시 이름은 대소문자 구분이 없기 때문에
            String cityName = cities[i].toLowerCase();

            // cache hit일 경우
            if (cache.contains(cityName)) {
                // 도시 이름을 처음에서 마지막으로 교체
                cache.remove(cityName);
                cache.add(cityName);
                answer++;

            } else { // cache miss일 경우
                // 캐시의 용량이 다 찼을 경우
                if (cache.size() >= cacheSize) {
                    // 가장 앞에있는 요소가 오랫동안 사용하지 않았으므로
                    cache.remove(0);
                }

                cache.add(cityName);
                answer += 5;
            }
        }

        return answer;
    }
}
