 BufferedImage image = ImageIO.read(new File("C:\\Users\\Qirol\\Desktop\\wallpaper-app\\upload\\mobile_thumb\\birinchi_wall24.png"));

        Font font = new Font("Arial", Font.BOLD, 18);

        Graphics g = image.getGraphics();
        g.setFont(font);
        g.setColor(Color.GREEN);
        g.drawString("brbalo", 10, 40);
        g.dispose();

        ImageIO.write(image, "png", new File("C:\\Users\\Qirol\\Desktop\\wallpaper-app\\upload\\mobile_thumb\\chizilgan.png"));

