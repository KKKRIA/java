package realization;

//인터페이스는 상수필드와 추상메소드만 선언 가능
public interface Wolf {
	//인터페이스에는 추상메소드만 선언 가능하므로 public abstract키워드 생략 가능
	void fastWalk(); //추상메소드라 명령 작성 안함
	void cryLoudly();
}
