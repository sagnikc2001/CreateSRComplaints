package com.dhdigital.api.model.backend;

import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfNotes", propOrder = { "notes" })
public class ListOfNotesBackend
{
    @XmlElement(name = "Notes", namespace = "http://www.siebel.com/xml/NCB%20Service%20Request%20Input")
    protected List<NotesBackend> notes;
    
    public List<NotesBackend> getNotes() {
        return notes;
    }

	public void setNotes(List<NotesBackend> notes) {
		this.notes = notes;
	}
}
