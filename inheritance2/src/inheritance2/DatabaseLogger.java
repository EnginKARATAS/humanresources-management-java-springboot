package inheritance2;

public class DatabaseLogger extends Logger{
	@Override //email kodunu bu class i�erisinde kendimiz yazd�k ve imzaya uyduk.//javada override kelimesini bu �ekilde yazmasak bile java �al���r. Peki buradaki olay ne? neden override ettik log()u. EmailLoggeri asl�nda polymorphism ile kullanaca��z. polymorphism uygularken, yani customerde yapt���m�z gibi customer di�erlerinin referans�n� tutuyordu ve customerin i�inde id alan� vard�. buradada logger class� customer class� gibidir. logger class� base g�revi g�r�r ve i�inde log ad�nda bir fonksyon vard�r. bizde �rne�in bu class i�erisinde extend etti�imiz logger class�n�n i�erisindeki log() fonksyonunun imzas�na uyarak function overloading yapm�� olduk. Yani burada email kodunu bu class i�erisinde kendimiz yazd�k ve imzaya uyduk.
	public void log() {
		System.out.println("Database Logland�");
	}
}
