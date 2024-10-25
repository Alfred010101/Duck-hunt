package controller;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfred
 */
public class TrayectoriaVuelo
{

    private List<Point> coordenadas;
    private List<String> sprites;
    private final int trayectoria;

    public TrayectoriaVuelo(int trayectoria)
    {
        this.coordenadas = new ArrayList<>();
        this.sprites = new ArrayList<>();
        this.trayectoria = trayectoria;
        setCordenadas();
        setSprites();
    }

    private void setCordenadas()
    {
        coordenadas = switch (trayectoria)
        {
            case 0 ->
                List.of(
                new Point(0, 100),
                new Point(15, 90),
                new Point(30, 80),
                new Point(45, 90),
                new Point(60, 100),
                new Point(75, 90),
                new Point(90, 80),
                new Point(105, 90),
                new Point(120, 100),
                new Point(135, 90),
                new Point(150, 80),
                new Point(165, 90),
                new Point(180, 100),
                new Point(195, 90),
                new Point(210, 80),
                new Point(225, 90),
                new Point(240, 100),
                new Point(255, 90),
                new Point(270, 80),
                new Point(285, 90),
                new Point(300, 100),
                new Point(315, 90),
                new Point(330, 80),
                new Point(345, 90),
                new Point(360, 100),
                new Point(375, 90),
                new Point(390, 80),
                new Point(405, 90),
                new Point(420, 100),
                new Point(435, 90),
                new Point(450, 80),
                new Point(465, 90),
                new Point(480, 100),
                new Point(495, 90),
                new Point(510, 80)
                );

            case 1 ->
                List.of(
                new Point(0, 260),
                new Point(12, 250),
                new Point(24, 240),
                new Point(36, 230),
                new Point(48, 220),
                new Point(60, 210),
                new Point(60, 200),
                new Point(96, 190),
                new Point(108, 180),
                new Point(120, 170),
                new Point(132, 160),
                new Point(144, 150),
                new Point(156, 140),
                new Point(168, 130),
                new Point(180, 120),
                new Point(192, 110),
                new Point(204, 100),
                new Point(216, 90),
                new Point(228, 80),
                new Point(240, 70),
                new Point(252, 60),
                new Point(264, 50),
                new Point(276, 40),
                new Point(288, 30),
                new Point(300, 20),
                new Point(312, 10),
                new Point(324, 0),
                new Point(336, -10),
                new Point(348, -20),
                new Point(360, -25),
                new Point(372, -30),
                new Point(384, -35),
                new Point(396, -40),
                new Point(405, -60)
                );

            case 2 ->
                List.of(
                new Point(500, 80),
                new Point(480, 75),
                new Point(460, 70),
                new Point(440, 80),
                new Point(420, 90),
                new Point(400, 75),
                new Point(380, 70),
                new Point(360, 75),
                new Point(340, 80),
                new Point(320, 70),
                new Point(300, 75),
                new Point(280, 70),
                new Point(260, 65),
                new Point(240, 80),
                new Point(220, 70),
                new Point(200, 75),
                new Point(180, 80),
                new Point(160, 70),
                new Point(140, 75),
                new Point(120, 85),
                new Point(100, 80),
                new Point(80, 75),
                new Point(60, 70),
                new Point(40, 75),
                new Point(20, 80),
                new Point(0, 75),
                new Point(-20, 70),
                new Point(-40, 75),
                new Point(-60, 80),
                new Point(-70, 85)
                );
           
            default ->
                List.of();
        };
    }

    public List<Point> getCoordenadas()
    {
        return coordenadas;
    }

    private void setSprites()
    {
        sprites = switch (trayectoria)
        {
            case 0, 1 ->
                List.of(
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png",
                "duckright4.png",
                "duckright1.png",
                "duckright2.png",
                "duckright3.png"
                );
            case 2 ->
                List.of(
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png"
                );
            default ->
                List.of(
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png",
                "duckleft3.png",
                "duckleft4.png",
                "duckleft1.png",
                "duckleft2.png"
                );
        };
    }

    public List<String> getSprites()
    {
        return sprites;
    }

//            coordenadas.add(new Point(0, 260));
//            coordenadas.add(new Point(20, 250));
//            coordenadas.add(new Point(40, 240));
//            coordenadas.add(new Point(50, 220));
//            coordenadas.add(new Point(60, 215));
//            coordenadas.add(new Point(70, 211));
//            coordenadas.add(new Point(60, 202));
//            coordenadas.add(new Point(50, 230));
//            coordenadas.add(new Point(60, 192));
//            coordenadas.add(new Point(80, 183));
//            coordenadas.add(new Point(100, 174));
//            coordenadas.add(new Point(130, 165));
//            coordenadas.add(new Point(150, 155));
//            coordenadas.add(new Point(170, 150));
//            coordenadas.add(new Point(190, 140));
//            coordenadas.add(new Point(210, 130));
//            coordenadas.add(new Point(240, 120));
//            coordenadas.add(new Point(270, 110));
//            coordenadas.add(new Point(300, 100));
//            coordenadas.add(new Point(320, 90));
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(20, 250));
//coordenadas.add(new Point(40, 240));
//coordenadas.add(new Point(50, 230));
//coordenadas.add(new Point(70, 220));
//coordenadas.add(new Point(90, 210));
//coordenadas.add(new Point(110, 200));
//coordenadas.add(new Point(130, 190));
//coordenadas.add(new Point(150, 180));
//coordenadas.add(new Point(170, 170));
//coordenadas.add(new Point(190, 160));
//coordenadas.add(new Point(210, 150));
//coordenadas.add(new Point(230, 140));
//coordenadas.add(new Point(250, 130));
//coordenadas.add(new Point(270, 120));
//coordenadas.add(new Point(290, 110));
//coordenadas.add(new Point(310, 100));
//coordenadas.add(new Point(330, 90));
//coordenadas.add(new Point(350, 80));
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(20, 240));
//coordenadas.add(new Point(40, 230));
//coordenadas.add(new Point(60, 220));
//coordenadas.add(new Point(80, 210));
//coordenadas.add(new Point(100, 190));
//coordenadas.add(new Point(120, 170));
//coordenadas.add(new Point(140, 150));
//coordenadas.add(new Point(160, 130));
//coordenadas.add(new Point(180, 120));
//coordenadas.add(new Point(200, 110));
//coordenadas.add(new Point(220, 100));
//coordenadas.add(new Point(240, 90));
//coordenadas.add(new Point(260, 80));
//coordenadas.add(new Point(280, 70));
//coordenadas.add(new Point(300, 60));
//coordenadas.add(new Point(320, 50));
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(20, 260));
//coordenadas.add(new Point(40, 250));
//coordenadas.add(new Point(60, 240));
//coordenadas.add(new Point(80, 250));
//coordenadas.add(new Point(100, 230));
//coordenadas.add(new Point(120, 240));
//coordenadas.add(new Point(140, 220));
//coordenadas.add(new Point(160, 230));
//coordenadas.add(new Point(180, 210));
//coordenadas.add(new Point(200, 220));
//coordenadas.add(new Point(220, 200));
//coordenadas.add(new Point(240, 210));
//coordenadas.add(new Point(260, 190));
//coordenadas.add(new Point(280, 200));
//coordenadas.add(new Point(300, 180));
//coordenadas.add(new Point(320, 190));
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(20, 240));
//coordenadas.add(new Point(40, 230));
//coordenadas.add(new Point(60, 220));
//coordenadas.add(new Point(80, 210));
//coordenadas.add(new Point(100, 205));
//coordenadas.add(new Point(120, 190));
//coordenadas.add(new Point(140, 180));
//coordenadas.add(new Point(160, 175));
//coordenadas.add(new Point(180, 160));
//coordenadas.add(new Point(200, 150));
//coordenadas.add(new Point(220, 145));
//coordenadas.add(new Point(240, 140));
//coordenadas.add(new Point(260, 135));
//coordenadas.add(new Point(280, 130));
//coordenadas.add(new Point(300, 125));
//coordenadas.add(new Point(320, 120));
//
//coordenadas.add(new Point(0, 240));
//coordenadas.add(new Point(20, 220));
//coordenadas.add(new Point(40, 200));
//coordenadas.add(new Point(60, 190));
//coordenadas.add(new Point(80, 210));
//coordenadas.add(new Point(100, 220));
//coordenadas.add(new Point(120, 240));
//coordenadas.add(new Point(140, 250));
//coordenadas.add(new Point(160, 240));
//coordenadas.add(new Point(180, 230));
//coordenadas.add(new Point(200, 220));
//coordenadas.add(new Point(220, 210));
//coordenadas.add(new Point(240, 205));
//coordenadas.add(new Point(260, 215));
//coordenadas.add(new Point(280, 230));
//coordenadas.add(new Point(300, 245));
//coordenadas.add(new Point(320, 250));
//
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(15, 240));
//coordenadas.add(new Point(30, 245));
//coordenadas.add(new Point(50, 230));
//coordenadas.add(new Point(70, 250));
//coordenadas.add(new Point(90, 240));
//coordenadas.add(new Point(110, 235));
//coordenadas.add(new Point(130, 245));
//coordenadas.add(new Point(150, 225));
//coordenadas.add(new Point(170, 230));
//coordenadas.add(new Point(190, 215));
//coordenadas.add(new Point(210, 225));
//coordenadas.add(new Point(230, 210));
//coordenadas.add(new Point(250, 220));
//coordenadas.add(new Point(270, 200));
//coordenadas.add(new Point(290, 210));
//coordenadas.add(new Point(310, 195));
//
//
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(50, 250));
//coordenadas.add(new Point(100, 240));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 245));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 240));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(400, 235));
//coordenadas.add(new Point(450, 250));
//        System.out.println("Aqui");
//// Trayectoria 1: Ascendente
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(30, 240));
//coordenadas.add(new Point(60, 220));
//coordenadas.add(new Point(90, 200));
//coordenadas.add(new Point(120, 180));
//coordenadas.add(new Point(150, 160));
//coordenadas.add(new Point(180, 140));
//coordenadas.add(new Point(210, 120));
//coordenadas.add(new Point(240, 100));
//coordenadas.add(new Point(270, 80));
//
//// Trayectoria 2: Descendente de Derecha a Izquierda
//coordenadas.add(new Point(510, 200));
//coordenadas.add(new Point(480, 210));
//coordenadas.add(new Point(450, 220));
//coordenadas.add(new Point(420, 230));
//coordenadas.add(new Point(390, 240));
//coordenadas.add(new Point(360, 250));
//coordenadas.add(new Point(330, 230));
//coordenadas.add(new Point(300, 220));
//coordenadas.add(new Point(270, 210));
//coordenadas.add(new Point(240, 200));
//
//// Trayectoria 3: Vuelo Errático
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(40, 240));
//coordenadas.add(new Point(70, 220));
//coordenadas.add(new Point(100, 230));
//coordenadas.add(new Point(130, 210));
//coordenadas.add(new Point(160, 240));
//coordenadas.add(new Point(190, 220));
//coordenadas.add(new Point(220, 200));
//coordenadas.add(new Point(250, 180));
//coordenadas.add(new Point(280, 160));
//
//// Trayectoria 4: Vertical desde la Izquierda
//coordenadas.add(new Point(100, 260));
//coordenadas.add(new Point(100, 240));
//coordenadas.add(new Point(100, 220));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(100, 180));
//coordenadas.add(new Point(100, 160));
//coordenadas.add(new Point(100, 140));
//coordenadas.add(new Point(100, 120));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(100, 80));
//
//// Trayectoria 5: Diagonal Ascendente
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(30, 250));
//coordenadas.add(new Point(60, 240));
//coordenadas.add(new Point(90, 220));
//coordenadas.add(new Point(120, 210));
//coordenadas.add(new Point(150, 190));
//coordenadas.add(new Point(180, 170));
//coordenadas.add(new Point(210, 150));
//coordenadas.add(new Point(240, 130));
//coordenadas.add(new Point(270, 110));
//
//// Trayectoria 6: Zig-Zag Vertical
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(30, 210));
//coordenadas.add(new Point(60, 200));
//coordenadas.add(new Point(90, 210));
//coordenadas.add(new Point(120, 200));
//coordenadas.add(new Point(150, 210));
//coordenadas.add(new Point(180, 200));
//coordenadas.add(new Point(210, 210));
//coordenadas.add(new Point(240, 200));
//coordenadas.add(new Point(270, 210));
//
//// Trayectoria 7: Horizontal de Izquierda a Derecha
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(50, 250));
//coordenadas.add(new Point(100, 240));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 230));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 240));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(400, 230));
//coordenadas.add(new Point(450, 250));
//
//// Trayectoria 8: Ascendente en Curva
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(50, 240));
//coordenadas.add(new Point(100, 220));
//coordenadas.add(new Point(150, 210));
//coordenadas.add(new Point(200, 190));
//coordenadas.add(new Point(250, 180));
//coordenadas.add(new Point(300, 160));
//coordenadas.add(new Point(350, 140));
//coordenadas.add(new Point(400, 120));
//coordenadas.add(new Point(450, 100));
//
//// Trayectoria 9: Descendente en Curva
//coordenadas.add(new Point(510, 0));
//coordenadas.add(new Point(480, 20));
//coordenadas.add(new Point(450, 40));
//coordenadas.add(new Point(420, 60));
//coordenadas.add(new Point(390, 80));
//coordenadas.add(new Point(360, 100));
//coordenadas.add(new Point(330, 120));
//coordenadas.add(new Point(300, 140));
//coordenadas.add(new Point(270, 160));
//coordenadas.add(new Point(240, 180));
//
//// Trayectoria 10: Movimiento Circular
//coordenadas.add(new Point(255, 250));
//coordenadas.add(new Point(280, 230));
//coordenadas.add(new Point(300, 210));
//coordenadas.add(new Point(315, 200));
//coordenadas.add(new Point(330, 190));
//coordenadas.add(new Point(315, 180));
//coordenadas.add(new Point(300, 170));
//coordenadas.add(new Point(280, 160));
//coordenadas.add(new Point(260, 150));
//coordenadas.add(new Point(240, 160));
//
//// Trayectoria 11: Movimiento de Sube y Baja
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(30, 240));
//coordenadas.add(new Point(60, 260));
//coordenadas.add(new Point(90, 250));
//coordenadas.add(new Point(120, 240));
//coordenadas.add(new Point(150, 260));
//coordenadas.add(new Point(180, 250));
//coordenadas.add(new Point(210, 240));
//coordenadas.add(new Point(240, 260));
//coordenadas.add(new Point(270, 250));
//
//// Trayectoria 12: Subida Rápida
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(20, 240));
//coordenadas.add(new Point(40, 230));
//coordenadas.add(new Point(60, 200));
//coordenadas.add(new Point(80, 180));
//coordenadas.add(new Point(100, 160));
//coordenadas.add(new Point(120, 140));
//coordenadas.add(new Point(140, 120));
//coordenadas.add(new Point(160, 100));
//coordenadas.add(new Point(180, 80));
//
//// Trayectoria 13: Sube y Baja Errática
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(40, 250));
//coordenadas.add(new Point(80, 270));
//coordenadas.add(new Point(120, 240));
//coordenadas.add(new Point(160, 260));
//coordenadas.add(new Point(200, 230));
//coordenadas.add(new Point(240, 250));
//coordenadas.add(new Point(280, 270));
//coordenadas.add(new Point(320, 240));
//coordenadas.add(new Point(360, 260));
//
//// Trayectoria 14: Circular hacia la izquierda
//coordenadas.add(new Point(500, 200));
//coordenadas.add(new Point(480, 180));
//coordenadas.add(new Point(460, 160));
//coordenadas.add(new Point(440, 140));
//coordenadas.add(new Point(420, 120));
//coordenadas.add(new Point(400, 100));
//coordenadas.add(new Point(380, 80));
//coordenadas.add(new Point(360, 60));
//coordenadas.add(new Point(340, 40));
//coordenadas.add(new Point(320, 20));
//
//// Trayectoria 15: Descenso Lateral
//coordenadas.add(new Point(510, 100));
//coordenadas.add(new Point(490, 120));
//coordenadas.add(new Point(470, 140));
//coordenadas.add(new Point(450, 160));
//coordenadas.add(new Point(430, 180));
//coordenadas.add(new Point(410, 200));
//coordenadas.add(new Point(390, 220));
//coordenadas.add(new Point(370, 240));
//coordenadas.add(new Point(350, 260));
//coordenadas.add(new Point(330, 250));
//
//// Trayectoria 16: Caída Libre
//coordenadas.add(new Point(250, 0));
//coordenadas.add(new Point(250, 50));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 450));
//
//// Trayectoria 17: Movimiento Zig-Zag
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(30, 240));
//coordenadas.add(new Point(60, 260));
//coordenadas.add(new Point(90, 240));
//coordenadas.add(new Point(120, 260));
//coordenadas.add(new Point(150, 240));
//coordenadas.add(new Point(180, 260));
//coordenadas.add(new Point(210, 240));
//coordenadas.add(new Point(240, 260));
//coordenadas.add(new Point(270, 240));
//
//// Trayectoria 18: Desplazamiento Diagonal Izquierda
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(20, 180));
//coordenadas.add(new Point(40, 160));
//coordenadas.add(new Point(60, 140));
//coordenadas.add(new Point(80, 120));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(120, 80));
//coordenadas.add(new Point(140, 60));
//coordenadas.add(new Point(160, 40));
//coordenadas.add(new Point(180, 20));
//
//// Trayectoria 19: Movimiento de Deslizamiento
//coordenadas.add(new Point(510, 0));
//coordenadas.add(new Point(490, 20));
//coordenadas.add(new Point(470, 40));
//coordenadas.add(new Point(450, 60));
//coordenadas.add(new Point(430, 80));
//coordenadas.add(new Point(410, 100));
//coordenadas.add(new Point(390, 120));
//coordenadas.add(new Point(370, 140));
//coordenadas.add(new Point(350, 160));
//coordenadas.add(new Point(330, 180));
//
//// Trayectoria 20: Curva en Sube y Baja
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(270, 380));
//coordenadas.add(new Point(290, 360));
//coordenadas.add(new Point(310, 340));
//coordenadas.add(new Point(330, 320));
//coordenadas.add(new Point(350, 300));
//coordenadas.add(new Point(370, 280));
//coordenadas.add(new Point(390, 260));
//coordenadas.add(new Point(410, 240));
//coordenadas.add(new Point(430, 220));
//
//// Trayectoria 21: Lateral Izquierda a Derecha
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 200));
//coordenadas.add(new Point(100, 180));
//coordenadas.add(new Point(150, 200));
//coordenadas.add(new Point(200, 180));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(300, 180));
//coordenadas.add(new Point(350, 200));
//coordenadas.add(new Point(400, 180));
//coordenadas.add(new Point(450, 200));
//
//// Trayectoria 22: Curva Abajo hacia Arriba
//coordenadas.add(new Point(510, 500));
//coordenadas.add(new Point(490, 480));
//coordenadas.add(new Point(470, 460));
//coordenadas.add(new Point(450, 440));
//coordenadas.add(new Point(430, 420));
//coordenadas.add(new Point(410, 400));
//coordenadas.add(new Point(390, 380));
//coordenadas.add(new Point(370, 360));
//coordenadas.add(new Point(350, 340));
//coordenadas.add(new Point(330, 320));
//
//// Trayectoria 23: Sube y Baja a la Derecha
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(30, 240));
//coordenadas.add(new Point(60, 260));
//coordenadas.add(new Point(90, 240));
//coordenadas.add(new Point(120, 250));
//coordenadas.add(new Point(150, 240));
//coordenadas.add(new Point(180, 260));
//coordenadas.add(new Point(210, 240));
//coordenadas.add(new Point(240, 250));
//coordenadas.add(new Point(270, 240));
//
//// Trayectoria 24: Movimiento en Escalera
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(50, 240));
//coordenadas.add(new Point(50, 210));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(150, 190));
//coordenadas.add(new Point(150, 160));
//coordenadas.add(new Point(200, 150));
//coordenadas.add(new Point(250, 140));
//coordenadas.add(new Point(300, 130));
//coordenadas.add(new Point(350, 120));
//
//// Trayectoria 25: Horizontal y Vertical
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 200));
//coordenadas.add(new Point(100, 180));
//coordenadas.add(new Point(100, 160));
//coordenadas.add(new Point(150, 140));
//coordenadas.add(new Point(200, 120));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(300, 80));
//coordenadas.add(new Point(350, 60));
//coordenadas.add(new Point(400, 40));
//
//// Trayectoria 26: Diagonal de Derecha a Izquierda
//coordenadas.add(new Point(510, 200));
//coordenadas.add(new Point(490, 210));
//coordenadas.add(new Point(470, 220));
//coordenadas.add(new Point(450, 230));
//coordenadas.add(new Point(430, 240));
//coordenadas.add(new Point(410, 250));
//coordenadas.add(new Point(390, 240));
//coordenadas.add(new Point(370, 230));
//coordenadas.add(new Point(350, 220));
//coordenadas.add(new Point(330, 210));
//
//// Trayectoria 27: Movimiento Oscilante
//coordenadas.add(new Point(0, 260));
//coordenadas.add(new Point(50, 240));
//coordenadas.add(new Point(100, 260));
//coordenadas.add(new Point(150, 240));
//coordenadas.add(new Point(200, 260));
//coordenadas.add(new Point(250, 240));
//coordenadas.add(new Point(300, 260));
//coordenadas.add(new Point(350, 240));
//coordenadas.add(new Point(400, 260));
//coordenadas.add(new Point(450, 240));
//
//// Trayectoria 28: Circulo en el Eje X
//coordenadas.add(new Point(255, 250));
//coordenadas.add(new Point(255, 240));
//coordenadas.add(new Point(265, 240));
//coordenadas.add(new Point(265, 250));
//coordenadas.add(new Point(265, 260));
//coordenadas.add(new Point(255, 260));
//coordenadas.add(new Point(245, 260));
//coordenadas.add(new Point(245, 250));
//coordenadas.add(new Point(245, 240));
//coordenadas.add(new Point(255, 240));
//
//// Trayectoria 29: Sube en Curva
//coordenadas.add(new Point(0, 500));
//coordenadas.add(new Point(30, 480));
//coordenadas.add(new Point(60, 460));
//coordenadas.add(new Point(90, 440));
//coordenadas.add(new Point(120, 420));
//coordenadas.add(new Point(150, 400));
//coordenadas.add(new Point(180, 380));
//coordenadas.add(new Point(210, 360));
//coordenadas.add(new Point(240, 340));
//coordenadas.add(new Point(270, 320));
//
//// Trayectoria 30: Descenso en Curva
//coordenadas.add(new Point(510, 0));
//coordenadas.add(new Point(490, 20));
//coordenadas.add(new Point(470, 40));
//coordenadas.add(new Point(450, 60));
//coordenadas.add(new Point(430, 80));
//coordenadas.add(new Point(410, 100));
//coordenadas.add(new Point(390, 120));
//coordenadas.add(new Point(370, 140));
//coordenadas.add(new Point(350, 160));
//coordenadas.add(new Point(330, 180));
//
//// Trayectoria 31: Movimiento en Onda
//coordenadas.add(new Point(0, 300));
//coordenadas.add(new Point(20, 280));
//coordenadas.add(new Point(40, 320));
//coordenadas.add(new Point(60, 280));
//coordenadas.add(new Point(80, 300));
//coordenadas.add(new Point(100, 290));
//coordenadas.add(new Point(120, 310));
//coordenadas.add(new Point(140, 290));
//coordenadas.add(new Point(160, 300));
//coordenadas.add(new Point(180, 280));
//
//// Trayectoria 32: Desplazamiento Vertical Rápido
//coordenadas.add(new Point(250, 0));
//coordenadas.add(new Point(250, 30));
//coordenadas.add(new Point(250, 60));
//coordenadas.add(new Point(250, 90));
//coordenadas.add(new Point(250, 120));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 180));
//coordenadas.add(new Point(250, 210));
//coordenadas.add(new Point(250, 240));
//coordenadas.add(new Point(250, 270));
//
//// Trayectoria 33: Desplazamiento Lateral Derecha
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(20, 200));
//coordenadas.add(new Point(40, 200));
//coordenadas.add(new Point(60, 200));
//coordenadas.add(new Point(80, 200));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(120, 200));
//coordenadas.add(new Point(140, 200));
//coordenadas.add(new Point(160, 200));
//coordenadas.add(new Point(180, 200));
//
//// Trayectoria 34: Movimiento en Espiral
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(260, 240));
//coordenadas.add(new Point(270, 230));
//coordenadas.add(new Point(280, 220));
//coordenadas.add(new Point(290, 210));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(310, 210));
//coordenadas.add(new Point(320, 220));
//coordenadas.add(new Point(330, 230));
//coordenadas.add(new Point(340, 240));
//
//// Trayectoria 35: Subida y Bajada en Línea Recta
//    coordenadas.add (
//
//    new Point(0, 300));
//    coordenadas.add (
//
//    new Point(30, 280));
//    coordenadas.add (
//
//    new Point(60, 300));
//    coordenadas.add (
//
//    new Point(90, 280));
//    coordenadas.add (
//
//    new Point(120, 300));
//    coordenadas.add (
//
//    new Point(150, 280));
//    coordenadas.add (
//
//    new Point(180, 300));
//    coordenadas.add (
//
//    new Point(210, 280));
//    coordenadas.add (
//
//    new Point(240, 300));
//    coordenadas.add (
//
//new Point(270, 280));
//
//// Trayectoria 36: Movimiento Aleatorio Corto
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(240, 210));
//coordenadas.add(new Point(260, 190));
//coordenadas.add(new Point(250, 220));
//coordenadas.add(new Point(240, 205));
//coordenadas.add(new Point(260, 215));
//coordenadas.add(new Point(255, 200));
//coordenadas.add(new Point(245, 210));
//coordenadas.add(new Point(265, 195));
//coordenadas.add(new Point(250, 205));
//
//// Trayectoria 37: Curva Lateral Derecha
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 180));
//coordenadas.add(new Point(100, 160));
//coordenadas.add(new Point(150, 180));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(250, 220));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(350, 180));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(450, 220));
//
//// Trayectoria 38: Movimiento Circular
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//coordenadas.add(new Point(230, 250));
//coordenadas.add(new Point(240, 260));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(260, 240));
//coordenadas.add(new Point(270, 250));
//coordenadas.add(new Point(260, 260));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//
//// Trayectoria 39: Desplazamiento Vertical Lento
//coordenadas.add(new Point(300, 0));
//coordenadas.add(new Point(300, 10));
//coordenadas.add(new Point(300, 20));
//coordenadas.add(new Point(300, 30));
//coordenadas.add(new Point(300, 40));
//coordenadas.add(new Point(300, 50));
//coordenadas.add(new Point(300, 60));
//coordenadas.add(new Point(300, 70));
//coordenadas.add(new Point(300, 80));
//coordenadas.add(new Point(300, 90));
//
//// Trayectoria 40: Movimiento de Deslizamiento Diagonal
//coordenadas.add(new Point(0, 300));
//coordenadas.add(new Point(20, 280));
//coordenadas.add(new Point(40, 260));
//coordenadas.add(new Point(60, 240));
//coordenadas.add(new Point(80, 220));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(120, 180));
//coordenadas.add(new Point(140, 160));
//coordenadas.add(new Point(160, 140));
//coordenadas.add(new Point(180, 120));
//
//// Trayectoria 41: Movimiento en Forma de U
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 250));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(150, 150));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(350, 150));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(450, 250));
//
//// Trayectoria 42: Trayectoria de Z
//coordenadas.add(new Point(0, 300));
//coordenadas.add(new Point(50, 280));
//coordenadas.add(new Point(100, 300));
//coordenadas.add(new Point(150, 280));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 280));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 280));
//coordenadas.add(new Point(400, 300));
//coordenadas.add(new Point(450, 280));
//
//// Trayectoria 43: Desplazamiento Lateral Izquierda
//coordenadas.add(new Point(500, 200));
//coordenadas.add(new Point(480, 200));
//coordenadas.add(new Point(460, 200));
//coordenadas.add(new Point(440, 200));
//coordenadas.add(new Point(420, 200));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(380, 200));
//coordenadas.add(new Point(360, 200));
//coordenadas.add(new Point(340, 200));
//coordenadas.add(new Point(320, 200));
//
//// Trayectoria 44: Movimiento Ascendente Lento
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 490));
//coordenadas.add(new Point(250, 480));
//coordenadas.add(new Point(250, 470));
//coordenadas.add(new Point(250, 460));
//coordenadas.add(new Point(250, 450));
//coordenadas.add(new Point(250, 440));
//coordenadas.add(new Point(250, 430));
//coordenadas.add(new Point(250, 420));
//coordenadas.add(new Point(250, 410));
//
//// Trayectoria 45: Movimiento de Subida y Bajada
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 180));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(150, 220));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(250, 180));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(350, 220));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(450, 180));
//
//// Trayectoria 46: Desplazamiento Horizontal en Línea Recta
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 200));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(150, 200));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(350, 200));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(450, 200));
//
//// Trayectoria 47: Movimiento de Lateralidad
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(30, 250));
//coordenadas.add(new Point(60, 200));
//coordenadas.add(new Point(90, 150));
//coordenadas.add(new Point(120, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(180, 200));
//coordenadas.add(new Point(210, 150));
//coordenadas.add(new Point(240, 200));
//coordenadas.add(new Point(270, 250));
//
//// Trayectoria 48: Trayectoria de Doble Curva
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(200, 150));
//coordenadas.add(new Point(150, 200));
//coordenadas.add(new Point(200, 250));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(300, 250));
//coordenadas.add(new Point(350, 200));
//coordenadas.add(new Point(300, 150));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(200, 250));
//
//// Trayectoria 49: Movimiento de Diagonal Hacia Arriba
//coordenadas.add(new Point(0, 500));
//coordenadas.add(new Point(50, 480));
//coordenadas.add(new Point(100, 460));
//coordenadas.add(new Point(150, 440));
//coordenadas.add(new Point(200, 420));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(300, 380));
//coordenadas.add(new Point(350, 360));
//coordenadas.add(new Point(400, 340));
//coordenadas.add(new Point(450, 320));
//
//// Trayectoria 50: Movimiento Circular Grande
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 300));
//
//// Trayectoria 51: Movimiento en Forma de D
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(50, 300));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(150, 200));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(350, 300));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(450, 200));
//
//// Trayectoria 52: Desplazamiento Ascendente
//coordenadas.add(new Point(200, 500));
//coordenadas.add(new Point(200, 490));
//coordenadas.add(new Point(200, 480));
//coordenadas.add(new Point(200, 470));
//coordenadas.add(new Point(200, 460));
//coordenadas.add(new Point(200, 450));
//coordenadas.add(new Point(200, 440));
//coordenadas.add(new Point(200, 430));
//coordenadas.add(new Point(200, 420));
//coordenadas.add(new Point(200, 410));
//
//// Trayectoria 53: Movimiento de Efecto Resorte
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(240, 210));
//coordenadas.add(new Point(260, 190));
//coordenadas.add(new Point(250, 205));
//coordenadas.add(new Point(240, 200));
//coordenadas.add(new Point(260, 210));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(240, 190));
//coordenadas.add(new Point(260, 200));
//coordenadas.add(new Point(250, 210));
//
//// Trayectoria 54: Trayectoria de Zigzag
//coordenadas.add(new Point(0, 300));
//coordenadas.add(new Point(30, 290));
//coordenadas.add(new Point(60, 310));
//coordenadas.add(new Point(90, 290));
//coordenadas.add(new Point(120, 310));
//coordenadas.add(new Point(150, 290));
//coordenadas.add(new Point(180, 310));
//coordenadas.add(new Point(210, 290));
//coordenadas.add(new Point(240, 310));
//coordenadas.add(new Point(270, 290));
//
//// Trayectoria 55: Movimiento hacia Abajo y a la Derecha
//coordenadas.add(new Point(300, 0));
//coordenadas.add(new Point(320, 20));
//coordenadas.add(new Point(340, 40));
//coordenadas.add(new Point(360, 60));
//coordenadas.add(new Point(380, 80));
//coordenadas.add(new Point(400, 100));
//coordenadas.add(new Point(420, 120));
//coordenadas.add(new Point(440, 140));
//coordenadas.add(new Point(460, 160));
//coordenadas.add(new Point(480, 180));
//
//// Trayectoria 56: Movimiento hacia Arriba y a la Izquierda
//coordenadas.add(new Point(500, 500));
//coordenadas.add(new Point(480, 480));
//coordenadas.add(new Point(460, 460));
//coordenadas.add(new Point(440, 440));
//coordenadas.add(new Point(420, 420));
//coordenadas.add(new Point(400, 400));
//coordenadas.add(new Point(380, 380));
//coordenadas.add(new Point(360, 360));
//coordenadas.add(new Point(340, 340));
//coordenadas.add(new Point(320, 320));
//
//// Trayectoria 57: Movimiento Curvilíneo
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 200));
//
//// Trayectoria 58: Movimiento de Subida en Espiral
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(240, 480));
//coordenadas.add(new Point(230, 460));
//coordenadas.add(new Point(240, 440));
//coordenadas.add(new Point(250, 420));
//coordenadas.add(new Point(260, 440));
//coordenadas.add(new Point(270, 460));
//coordenadas.add(new Point(260, 480));
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(240, 520));
//
//// Trayectoria 59: Desplazamiento Descendente Rápido
//coordenadas.add(new Point(300, 0));
//coordenadas.add(new Point(300, 30));
//coordenadas.add(new Point(300, 60));
//coordenadas.add(new Point(300, 90));
//coordenadas.add(new Point(300, 120));
//coordenadas.add(new Point(300, 150));
//coordenadas.add(new Point(300, 180));
//coordenadas.add(new Point(300, 210));
//coordenadas.add(new Point(300, 240));
//coordenadas.add(new Point(300, 270));
//
//// Trayectoria 60: Movimiento en Forma de C
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 61: Movimiento en Serpentina
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(200, 290));
//coordenadas.add(new Point(150, 310));
//coordenadas.add(new Point(100, 290));
//coordenadas.add(new Point(50, 310));
//coordenadas.add(new Point(0, 290));
//coordenadas.add(new Point(50, 270));
//coordenadas.add(new Point(100, 290));
//coordenadas.add(new Point(150, 310));
//coordenadas.add(new Point(200, 290));
//
//// Trayectoria 62: Movimiento Hacia Arriba y en Línea Recta
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 290));
//coordenadas.add(new Point(250, 280));
//coordenadas.add(new Point(250, 270));
//coordenadas.add(new Point(250, 260));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 240));
//coordenadas.add(new Point(250, 230));
//coordenadas.add(new Point(250, 220));
//coordenadas.add(new Point(250, 210));
//
//// Trayectoria 63: Movimiento Descendente en Espiral
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(260, 480));
//coordenadas.add(new Point(270, 460));
//coordenadas.add(new Point(280, 440));
//coordenadas.add(new Point(290, 420));
//coordenadas.add(new Point(300, 400));
//coordenadas.add(new Point(310, 380));
//coordenadas.add(new Point(320, 360));
//coordenadas.add(new Point(330, 340));
//coordenadas.add(new Point(340, 320));
//
//// Trayectoria 64: Movimiento en Forma de Z
//coordenadas.add(new Point(0, 400));
//coordenadas.add(new Point(100, 400));
//coordenadas.add(new Point(100, 300));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(200, 400));
//coordenadas.add(new Point(300, 400));
//coordenadas.add(new Point(300, 500));
//coordenadas.add(new Point(400, 500));
//coordenadas.add(new Point(400, 400));
//coordenadas.add(new Point(500, 400));
//
//// Trayectoria 65: Desplazamiento en Cuadrado
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(400, 100));
//coordenadas.add(new Point(400, 400));
//coordenadas.add(new Point(100, 400));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 100));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(300, 100));
//coordenadas.add(new Point(400, 100));
//
//// Trayectoria 66: Movimiento de Rebote
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(200, 250));
//coordenadas.add(new Point(300, 250));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 250));
//
//// Trayectoria 67: Trayectoria de Espiral
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(240, 480));
//coordenadas.add(new Point(230, 460));
//coordenadas.add(new Point(220, 440));
//coordenadas.add(new Point(210, 420));
//coordenadas.add(new Point(200, 400));
//coordenadas.add(new Point(190, 380));
//coordenadas.add(new Point(180, 360));
//coordenadas.add(new Point(170, 340));
//coordenadas.add(new Point(160, 320));
//
//// Trayectoria 68: Movimiento Lateral Izquierdo
//coordenadas.add(new Point(500, 250));
//coordenadas.add(new Point(490, 250));
//coordenadas.add(new Point(480, 250));
//coordenadas.add(new Point(470, 250));
//coordenadas.add(new Point(460, 250));
//coordenadas.add(new Point(450, 250));
//coordenadas.add(new Point(440, 250));
//coordenadas.add(new Point(430, 250));
//coordenadas.add(new Point(420, 250));
//coordenadas.add(new Point(410, 250));
//
//// Trayectoria 69: Movimiento Vertical en Línea Recta
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 600));
//coordenadas.add(new Point(250, 700));
//coordenadas.add(new Point(250, 800));
//coordenadas.add(new Point(250, 900));
//coordenadas.add(new Point(250, 1000));
//
//// Trayectoria 70: Movimiento en Forma de O
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 71: Movimiento en Línea Recta
//coordenadas.add(new Point(250, 0));
//coordenadas.add(new Point(250, 50));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 450));
//
//// Trayectoria 72: Movimiento Ascendente en Línea Recta
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 490));
//coordenadas.add(new Point(250, 480));
//coordenadas.add(new Point(250, 470));
//coordenadas.add(new Point(250, 460));
//coordenadas.add(new Point(250, 450));
//coordenadas.add(new Point(250, 440));
//coordenadas.add(new Point(250, 430));
//coordenadas.add(new Point(250, 420));
//coordenadas.add(new Point(250, 410));
//
//// Trayectoria 73: Movimiento en Forma de X
//coordenadas.add(new Point(0, 0));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(400, 400));
//coordenadas.add(new Point(500, 500));
//coordenadas.add(new Point(400, 400));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(100, 100));
//
//// Trayectoria 74: Movimiento Circular Pequeño
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//coordenadas.add(new Point(230, 250));
//coordenadas.add(new Point(240, 260));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(260, 260));
//coordenadas.add(new Point(270, 250));
//coordenadas.add(new Point(260, 240));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//
//// Trayectoria 75: Movimiento en Forma de L
//coordenadas.add(new Point(250, 0));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(350, 200));
//coordenadas.add(new Point(350, 300));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(350, 400));
//coordenadas.add(new Point(350, 500));
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 600));
//
//// Trayectoria 76: Desplazamiento Horizontal
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(100, 250));
//coordenadas.add(new Point(200, 250));
//coordenadas.add(new Point(300, 250));
//coordenadas.add(new Point(400, 250));
//coordenadas.add(new Point(500, 250));
//coordenadas.add(new Point(600, 250));
//coordenadas.add(new Point(700, 250));
//coordenadas.add(new Point(800, 250));
//coordenadas.add(new Point(900, 250));
//
//// Trayectoria 77: Movimiento en Forma de Círculo
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 78: Movimiento en Forma de Z
//coordenadas.add(new Point(0, 0));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 0));
//coordenadas.add(new Point(300, 100));
//coordenadas.add(new Point(400, 0));
//coordenadas.add(new Point(500, 100));
//coordenadas.add(new Point(600, 0));
//coordenadas.add(new Point(700, 100));
//coordenadas.add(new Point(800, 0));
//coordenadas.add(new Point(900, 100));
//
//// Trayectoria 79: Movimiento en Forma de D
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 100));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(50, 150));
//coordenadas.add(new Point(100, 100));
//
//// Trayectoria 80: Trayectoria en Forma de A
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(200, 400));
//coordenadas.add(new Point(300, 400));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 500));
//
//// Trayectoria 81: Trayectoria Ascendente
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 0));
//
//// Trayectoria 82: Movimiento Lateral Derecha
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(100, 250));
//coordenadas.add(new Point(200, 250));
//coordenadas.add(new Point(300, 250));
//coordenadas.add(new Point(400, 250));
//coordenadas.add(new Point(500, 250));
//coordenadas.add(new Point(600, 250));
//coordenadas.add(new Point(700, 250));
//coordenadas.add(new Point(800, 250));
//coordenadas.add(new Point(900, 250));
//
//// Trayectoria 83: Movimiento en Zigzag
//coordenadas.add(new Point(0, 250));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(400, 300));
//coordenadas.add(new Point(500, 200));
//coordenadas.add(new Point(600, 300));
//coordenadas.add(new Point(700, 200));
//coordenadas.add(new Point(800, 300));
//coordenadas.add(new Point(900, 200));
//
//// Trayectoria 84: Movimiento en Forma de C
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 85: Movimiento en Forma de 8
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(250, 250));
//
//// Trayectoria 86: Movimiento Lateral en Espiral
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//coordenadas.add(new Point(230, 250));
//coordenadas.add(new Point(240, 260));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(260, 260));
//coordenadas.add(new Point(270, 250));
//coordenadas.add(new Point(260, 240));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//
//// Trayectoria 87: Trayectoria Descendente
//coordenadas.add(new Point(250, 0));
//coordenadas.add(new Point(250, 50));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 450));
//
//// Trayectoria 88: Movimiento en Línea Recta
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 450));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 50));
//
//// Trayectoria 89: Trayectoria en Forma de U
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(200, 100));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(400, 300));
//
//// Trayectoria 90: Movimiento Circular Grande
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 91: Trayectoria Ascendente en Línea Recta
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 490));
//coordenadas.add(new Point(250, 480));
//coordenadas.add(new Point(250, 470));
//coordenadas.add(new Point(250, 460));
//coordenadas.add(new Point(250, 450));
//coordenadas.add(new Point(250, 440));
//coordenadas.add(new Point(250, 430));
//coordenadas.add(new Point(250, 420));
//coordenadas.add(new Point(250, 410));
//
//// Trayectoria 92: Movimiento en Forma de W
//coordenadas.add(new Point(0, 200));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(300, 100));
//coordenadas.add(new Point(400, 200));
//coordenadas.add(new Point(500, 100));
//coordenadas.add(new Point(600, 200));
//coordenadas.add(new Point(700, 100));
//coordenadas.add(new Point(800, 200));
//coordenadas.add(new Point(900, 100));
//
//// Trayectoria 93: Movimiento en Línea Vertical
//coordenadas.add(new Point(250, 0));
//coordenadas.add(new Point(250, 50));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 450));
//
//// Trayectoria 94: Movimiento en Forma de R
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(300, 250));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 95: Trayectoria en Espiral
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//coordenadas.add(new Point(230, 250));
//coordenadas.add(new Point(240, 260));
//coordenadas.add(new Point(250, 270));
//coordenadas.add(new Point(260, 260));
//coordenadas.add(new Point(270, 250));
//coordenadas.add(new Point(260, 240));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(240, 240));
//
//// Trayectoria 96: Movimiento Lateral Ascendente
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 50));
//coordenadas.add(new Point(300, 100));
//coordenadas.add(new Point(400, 50));
//coordenadas.add(new Point(500, 100));
//coordenadas.add(new Point(600, 50));
//coordenadas.add(new Point(700, 100));
//coordenadas.add(new Point(800, 50));
//coordenadas.add(new Point(900, 100));
//
//// Trayectoria 97: Trayectoria en Forma de C
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(150, 250));
//coordenadas.add(new Point(200, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(350, 250));
//coordenadas.add(new Point(300, 200));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(200, 200));
//
//// Trayectoria 98: Movimiento en Forma de D
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 100));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(100, 200));
//coordenadas.add(new Point(50, 150));
//coordenadas.add(new Point(100, 100));
//
//// Trayectoria 99: Movimiento en Línea Diagonal
//coordenadas.add(new Point(0, 0));
//coordenadas.add(new Point(100, 100));
//coordenadas.add(new Point(200, 200));
//coordenadas.add(new Point(300, 300));
//coordenadas.add(new Point(400, 400));
//coordenadas.add(new Point(500, 500));
//coordenadas.add(new Point(600, 600));
//coordenadas.add(new Point(700, 700));
//coordenadas.add(new Point(800, 800));
//coordenadas.add(new Point(900, 900));
// Trayectoria 100: Movimiento en Línea Recta
//coordenadas.add(new Point(250, 500));
//coordenadas.add(new Point(250, 450));
//coordenadas.add(new Point(250, 400));
//coordenadas.add(new Point(250, 350));
//coordenadas.add(new Point(250, 300));
//coordenadas.add(new Point(250, 250));
//coordenadas.add(new Point(250, 200));
//coordenadas.add(new Point(250, 150));
//coordenadas.add(new Point(250, 100));
//coordenadas.add(new Point(250, 50));
}
