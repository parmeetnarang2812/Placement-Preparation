class Solution {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // rectangle 1
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        // rectangle 2
        int area2 = (bx2 - bx1) * (by2 - by1);

        // common rectangle
        // bottom-left corner
        int cx1 = Math.max(ax1, bx1);
        int cy1 = Math.max(ay1, by1);
        // top-right corner
        int cx2 = Math.min(ax2, bx2);
        int cy2 = Math.min(ay2, by2);

        int cl = (cx2 - cx1);
        int ch = (cy2 - cy1);

        //common area
        int common = 0;
        if (cl > 0 && ch > 0) {
            common = cl * ch;
        }

        // total area
        return area1 + area2 - common;
    }
}
