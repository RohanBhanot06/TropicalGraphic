# Tropical Island Graphics Scene (Java Swing)

A Java Swing / Java2D graphics project that draws a tropical island scene inspired by the Nicobar Islands (India).  
The scene includes a gradient sky, sun, clouds, mountains, palm trees, ocean waves, bushes, birds, and a detailed sailboat with a flag.

---

## Overview

This program renders a static tropical landscape inside a `JFrame` using Java2D:

- Background gradient sky
- Sun with a radial-style gradient
- Multiple layered clouds and birds
- Ocean with gradient water and stylized waves
- Sandy island with mountains and rounded hills
- Palm trees, bushes, and large tropical leaves
- A sailboat with hull, stripes, mast, and flag details

It showcases the use of:

- `Graphics2D`
- `GradientPaint`
- `Path2D`
- `Polygon`
- `Arc2D`
- Basic shapes (`Rectangles`, `Ovals`) and custom drawing methods

---

## Visual Elements

### 1. Sky & Background

- Uses a **vertical gradient** from light blue to a lighter white-blue:
  - Start: `new Color(78, 204, 220)`  
  - End: `new Color(186, 240, 250)`
- Fills the entire frame (`0,0` to `500×400`).

### 2. Sun

- Drawn as a `fillOval(420, 0, 100, 100)`.
- Uses another `GradientPaint`:
  - Start: `Color.YELLOW`
  - End: deep orange `new Color(255, 140, 0)`

### 3. Clouds

- Light, soft clouds using `fillOval` calls with a very light cyan color:
  - `new Color(224, 252, 254)`
- Clustered across the top of the scene in different positions and sizes.

### 4. Birds

- Drawn in white using the helper method `drawBird(Graphics2D ga, int x, int y)`.
- Each bird is made of two small arcs (left wing and right wing) using `Arc2D.Float`.
- Several birds are placed at various positions in the sky to give a sense of depth and motion.

### 5. Ocean & Waves

- Ocean is a rectangle from `y = 200` to bottom of the window:
  - Gradient from lighter blue to darker blue:
    - `new Color(105, 223, 251)` → `new Color(0, 118, 209)`
- Waves are drawn as repeated arcs using the helper:
  - `drawWave(Graphics2D ga, int x, int y, int width, int height)`
  - Rows of waves at multiple `y` positions (200–390) to create layered water texture.

### 6. Island & Sand

- The island is built using several overlapping `fillOval` shapes:
  - Base sand colors: `new Color(255, 235, 193)` and `new Color(251, 226, 170)`
- Creates a soft, rounded sand bank that sits at the waterline.

### 7. Mountains & Rounded Hills

- Multiple `Polygon` objects create mountain peaks and layers:
  - Darker and lighter blues/greys for depth (`new Color(89, 110, 124)`, `new Color(126, 155, 177)`, `new Color(115, 142, 165)`).
- Additional rounded mountains are drawn using `Path2D.Double` and `curveTo`:
  - Three layered round mountain paths (`mountain1`, `mountain2`, `mountain3`) to give a smoother, stylized look.

### 8. Palm Trees

- Drawn using `drawPalmTree(Graphics2D ga, int x, int y)`.
- Each palm tree:
  - Trunk: simple brown rectangle (`new Color(94, 80, 48)`).
- Trees are placed along the island at several x positions to form a tropical coastline.

### 9. Bushes

- Bushes use another vertical `GradientPaint`:
  - From darker green `new Color(36, 105, 3)` to lighter green `new Color(113, 193, 4)`.
- Drawn as repeated `fillOval` calls at the base of the mountains / island.

### 10. Boat & Flag

- Drawn using `drawBoat(Graphics2D ga, int x, int y)`:
  - Boat body: multiple `Arc2D.Float` shapes for hull and decorative stripes, using browns and light beige tones.
  - Mast: black rectangles for vertical and horizontal supports.
  - Sail and flag: combination of `Arc2D.Float` and `Polygon` shapes in white and red.
- Includes a “string” detail drawn as an arc.

### 11. Leaves

- Large tropical leaves are drawn using `drawLeaf(Graphics2D ga, int x, int y)`:
  - Multiple overlapping `Arc2D.Float` shapes to create layered leaf clusters.
  - Uses varying green shades:
    - `new Color(115, 189, 7)`
    - `new Color(78, 152, 4)`

---

## Code Structure

### Main Class: `RohanGraphicsAssignment`

- Extends `JFrame`.
- Overrides `paint(Graphics g)`:
  - Casts to `Graphics2D`.
  - Enables antialiasing with:
    ```java
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    ```
  - Draws all elements in a layered order:
    1. Background sky
    2. Sun
    3. Clouds
    4. Birds
    5. Ocean & waves
    6. Island & mountains
    7. Palm trees & bushes
    8. Boat & flag
    9. Foreground leaves

- `main(String[] args)`:
  ```java
  public static void main(String args[]) {
      JFrame frame = new RohanGraphicsAssignment();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 400);
      frame.setVisible(true);
  }
