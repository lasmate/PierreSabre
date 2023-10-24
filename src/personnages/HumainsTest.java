@Test
public void testAcheterWithEnoughMoney() {
    Humains humain = new Humains();
    humain.setArgent(100);
    humain.acheter("livre", 20);
    assertEquals(80, humain.getArgent());
}

@Test
public void testAcheterWithNotEnoughMoney() {
    Humains humain = new Humains();
    humain.setArgent(10);
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    humain.acheter("voiture", 100);
    assertEquals("Je n'ai pas assez d'argent pour acheter ce voiture!\n", outContent.toString());
    assertEquals(10, humain.getArgent());
}