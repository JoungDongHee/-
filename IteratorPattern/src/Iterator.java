public interface Iterator {
    boolean next(); // 다음 구성 데이터 가 있다면 True 없다면 False
    Object current(); // 다음 값을 반환
}
