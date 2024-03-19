package net.codejava.dto;


public class CandidateDTO {
    private Long id;
    private Long electionId;
    private String name;
    private String description;
    private String image;
    private String contactInformation;

    // Constructors
    public CandidateDTO() {
    }

    public CandidateDTO(Long id, Long electionId, String name, String description, String image, String contactInformation) {
        this.id = id;
        this.electionId = electionId;
        this.name = name;
        this.description = description;
        this.image = image;
        this.contactInformation = contactInformation;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getElectionId() {
        return electionId;
    }

    public void setElectionId(Long electionId) {
        this.electionId = electionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
