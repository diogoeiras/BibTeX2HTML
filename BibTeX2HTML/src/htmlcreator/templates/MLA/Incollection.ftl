<#list IncollectionList as IncollectionData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${IncollectionData.citationKey}</li>
			<li>${IncollectionData.author}
				
				${IncollectionData.booktitle}
				 "${IncollectionData.title}"
				 <#if IncollectionData.volume??>
				 <#if IncollectionData.chapter??>
				(${IncollectionData.chapter})
				</#if>
				,vol. ${IncollectionData.volume}
				</#if>
				
				<#if IncollectionData.address??>
				,${IncollectionData.address}
				</#if>
				<i>,${IncollectionData.publisher}</i>
				(${IncollectionData.year}
				<#if IncollectionData.month??>
				,${IncollectionData.month}
				</#if>).
			<#if IncollectionData.editor??>
				,${IncollectionData.editor}
			</#if>
			<#if IncollectionData.series??>
				,${IncollectionData.series} series
			</#if>
			<#if IncollectionData.type??>
				<,${IncollectionData.type}
			</#if>
			
			<#if IncollectionData.edition??>
				,${IncollectionData.edition} edition,
			</#if>
			<#if IncollectionData.note??>
				,${IncollectionData.note}
			</#if>
			<#if IncollectionData.key??>
				,${IncollectionData.key}
			</#if>
			<#if IncollectionData.crossref??>
				,${IncollectionData.crossref}
			</#if>
			<#if IncollectionData.pages??>
				,p. ${IncollectionData.pages}
				</#if></li>
		</ul>
	</div>
</#list>