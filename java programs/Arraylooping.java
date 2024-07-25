class Arraylooping{
public static void main(String[] args) {
System.out.println("Running a main in Arraylooping");
System.out.println("Ruuning a main in movie names");
String[] kannadaMovies = {
"KGF", "Ulidavaru Kandanthe", "Mungaru Male", "Kirik Party", "Lucia", "U Turn", "Gaalipata", "Sankashta Kara Ganapathi",
"Thithi", "Rangitaranga", "Mufti", "Avane Srimannarayana","Bell Bottom", "Anjaniputra", "Tagaru", "Birbal Trilogy",
"Mayabazar 2016", "Sarkari Hiriya Prathamika Shaale", "Ayogya", "Gubbi Mele Brahmastra"};

System.out.println("Number of movie names: " + kannadaMovies.length);
for (int movienames = 0; movienames < kannadaMovies.length; movienames++)
	{
 System.out.println(kannadaMovies[movienames]);
    }
	
System.out.println("////////////////////////");

System.out.println("Ruuning a main in song names");
		
String[] songNames = {"Ninna Gungalli", "Anisuthide", "Neene Bari Neene", "Jotheyali", "Mundhinam Parthenae", "Maleyali Jotheyali", "Hrudayake Hedarike", 
"Neene Neene", "Sanju Weds Geetha", "Onde Usirinda"};

System.out.println("Number of song names: " + songNames.length);
for (int songs = 0; songs < songNames.length; songs++)
	{
System.out.println(songNames[songs]);
    }
		
		
System.out.println("////////////////////////");
System.out.println("Ruuning a main in indianState names");
		
		
String[] indianStates = { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", 
"Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
"Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", 
"Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"  };

        
System.out.println("Number of Indian states: " + indianStates.length);

for (int status = 0; status < indianStates.length; status++) 
  {
System.out.println(indianStates[status]);
  }
		
System.out.println("////////////////////////");
System.out.println("Ruuning a main in game names");
		
String[] gameNames = { "Chess", "Soccer", "Basketball", "Cricket", "Tennis", "Badminton", "Hockey", "Volleyball", 
"Baseball", "Table Tennis"};

System.out.println("Number of game names: " + gameNames.length);

for (int games = 0; games < gameNames.length; games++)
	{
System.out.println(gameNames[games]);
    }
		
System.out.println("////////////////////////");
System.out.println("Ruuning a main in car names");
		
String[] carNames = { "Toyota Camry", "Honda Accord", "Ford Mustang", "Chevrolet Malibu", "Tesla Model S", "BMW 3 Series", "Audi A4", "Mercedes-Benz C-Class", 
"Lexus ES", "Hyundai Elantra", "Nissan Altima", "Volkswagen Passat", "Kia Optima", "Mazda 6", "Subaru Legacy" };

System.out.println("Number of car names: " + carNames.length);

for (int cars = 0; cars < carNames.length; cars++)
	{
 System.out.println(carNames[cars]);
    }
		
System.out.println("////////////////////////");
System.out.println("Ruuning a main in anima names");
		
String[] animalNames = {"Lion", "Tiger", "Elephant", "Giraffe", "Zebra", "Kangaroo", "Panda", "Leopard", 
"Cheetah", "Rhinoceros", "Hippopotamus", "Gorilla", "Chimpanzee", "Orangutan", "Wolf", "Fox", 
"Bear", "Deer", "Moose", "Bison" };

        
System.out.println("Number of animal names: " + animalNames.length);

        
for (int animals = 0; animals < animalNames.length; animals++)
	{
System.out.println(animalNames[animals]);
    }
		
System.out.println("////////////////////////");
System.out.println("Ruuning a main in snak names");
		
String[] Snacks = { "ravae unde", "pani puri", "chakkuli", "jamun", "talipattu", "vada paav", "pizza", "burger",
"chips", "biscuit", "missal", "Methi Thepla", "french fries", "sandwitch", "banana chips", "paddu","parota", 
"idli", "Huggi", "chivada","Bhaji", "Samosa", "Kachori", "Bhakri","Puliyogare", "Pulao" };

        
System.out.println("Number of  snacks: " + Snacks.length);

        
for (int snak = 0; snak < Snacks.length; snak++) 
{
System.out.println(Snacks[snak]);
}
		
System.out.println("////////////////////////");
System.out.println("Ruuning a main in busNumber");
		
 String[] busNumbers = { "123A", "456B", "789C", "101D", "202E"};

System.out.println("Number of bus numbers: " + busNumbers.length);

for (int busNo=0; busNo<busNumbers.length; busNo++)
{
System.out.println(busNumbers[ busNo]);
        }
    }
}