package com.jdc.akk.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String religion;
	private String hobbies;
	private String description;	
}
