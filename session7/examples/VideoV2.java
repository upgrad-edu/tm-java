public class VideoV2 {
    private String id;
    private String name;
    private int size;

    public VideoV2(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", size: " + size;
    }

    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode() + size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VideoV2) {
            VideoV2 v2 = (VideoV2) obj;
            return this.id.equals(v2.getId())
                    && this.name.equals(v2.getName())
                    && this.size == v2.getSize();
        }
        return false;
    }
}
