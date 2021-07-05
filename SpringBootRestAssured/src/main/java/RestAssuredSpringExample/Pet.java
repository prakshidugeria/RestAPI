package RestAssuredSpringExample;

public class Pet {

    private Integer id;
    private category category;
    private String name;
    private String[] photoUrls;
    private tags[] tags;
    private String status;

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RestAssuredSpringExample.category getCategory() {
        return category;
    }

    public void setCategory(RestAssuredSpringExample.category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public RestAssuredSpringExample.tags[] getTags() {
        return tags;
    }

    public void setTags(RestAssuredSpringExample.tags[] tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pet(Integer id, category category, String name, String[] photoUrls, tags[] tags, String status) {
        setId(id);
        setCategory(category);
        setName(name);
        setPhotoUrls(photoUrls);
        setTags(tags);
        setStatus(status);
    }


}
