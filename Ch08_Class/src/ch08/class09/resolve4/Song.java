package ch08.class09.resolve4;

/*
 * 4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
   <필드>
    노래제목 title
    가수    artist
    앨범제목 album
    작곡가  composer
    노래가 발표된 연도 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

   <메서드>
    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
    노래의 정보를 나타내는 show()

   <main 실행>
    ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
    Show()로 출력하세요
 */
public class Song {
	private String title;				// 노래 제목
	private String artist;				// 가수
	private String album;				// 앨범 제목
	private String composer;			// 작곡가
	private int year;					// 노래가 발표된 연도
	private int track;					// 노래가 속한 앨범에서의 트랙 번호를 나타냄
	
	/**
	 * 노래 정보 초기 세팅
	 * @param title = 노래 제목
	 * @param artist = 가수
	 * @param album = 앨범 제목
	 * @param composer = 작곡가
	 * @param year = 노래가 발표된 연도
	 * @param track = 노래가 속한 앨범에서의 트랙 번호를 나타냄
	 */
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.printf("---------------노래 정보---------------\n노래 제목 : %s\n가수 : %s\n앨범 제목 : %s\n작곡가 : %s\n노래가 발표된 연도 : %d\n노래가 속한 앨범에서의 트랙 번호 : %d\n-------------------------------------\n\n", title, artist, album, composer, year, track);
	}
}
