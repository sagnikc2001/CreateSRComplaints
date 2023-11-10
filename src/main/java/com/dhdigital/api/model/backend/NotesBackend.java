package com.dhdigital.api.model.backend;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notes", propOrder = { "note", "noteType" })
public class NotesBackend
{
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "NoteType", required = true)
    protected String noteType;
    
    public String getNote() {
        return this.note;
    }
    
    public void setNote(final String note) {
        this.note = note;
    }
    
    public String getNoteType() {
        return this.noteType;
    }
    
    public void setNoteType(final String noteType) {
        this.noteType = noteType;
    }

	@Override
	public String toString() {
		return "Notes [note=" + note + ", noteType=" + noteType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(note, noteType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotesBackend other = (NotesBackend) obj;
		return Objects.equals(note, other.note) && Objects.equals(noteType, other.noteType);
	}

	public NotesBackend() {
		super();
	}

	public NotesBackend(String note, String noteType) {
		super();
		this.note = note;
		this.noteType = noteType;
	}
    
    
}