<#list TechreportList as TechreportData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${TechreportData.citationKey}</li>
			<li>${TechreportData.author}.
				(${TechreportData.year}
				<#if TechreportData.month??>, ${TechreportData.month}</#if>).
				<i>${TechreportData.title}.</i>
				<#if TechreportData.address??> ${TechreportData.address}:</#if>
				${TechreportData.institution}.
				<#if TechreportData.type??> ${TechreportData.type}.</#if>
				<#if TechreportData.number??> ${TechreportData.number}.</#if>
				<#if TechreportData.note??> ${TechreportData.note}.</#if>
				<#if TechreportData.key??> ${TechreportData.key}.</#if>
				<#if TechreportData.crossref??> ${TechreportData.crossref}.</#if>
		</ul>
	</div>
</#list>