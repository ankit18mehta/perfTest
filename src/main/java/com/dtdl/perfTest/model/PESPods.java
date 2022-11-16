package com.dtdl.perfTest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document(collection = "PESPods")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PESPods {
	

	@Id()
	private String id;
	@NonNull
	private String podName;
	@NonNull
	private String teamSize;
	@NonNull
	private String natcosLive;
	

}
