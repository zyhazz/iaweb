<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Rotas na Romênia</h1>
<div align="center">
	<c:choose>
	<c:when test="${tipo == 9 || tipo == 8}"><h2>Caminho de ${origem } para BUCHAREST usando ${agenteTipo}</h2></c:when>
	<c:otherwise>
	<h2>Caminho de ${origem } para ${destino } usando ${agenteTipo}<c:if test="${tipo==4 }"> com limite ${limite }</c:if></h2>
	</c:otherwise>
	</c:choose>
	<c:choose>
	<c:when test="${sucesso}">
		<div class="well">
		<ul class="list-group list-inline">
			<c:forEach var="rota" items="${rota}" varStatus="id">
				<li class="list-group-item">${rota.estado}</li>
			</c:forEach>
		</ul> 
	</div>
	<div style="width: 80%; height: 0; margin: 0 auto; display: inline-block; position: relative;">
    <svg viewBox="0 0 800 500" xmlns="http://www.w3.org/2000/svg">
 <g>
  <g>
  <line id="line-arad-zerind" x1="65" y1="145" x2="90" y2="85" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-zerind-oradea" x1="90" y1="85" x2="120" y2="30" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-oradea-sibiu" x1="120" y1="30" x2="235" y2="195" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-arad-sibiu" x1="65" y1="145" x2="235" y2="195" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-arad-timissoara" x1="65" y1="145" x2="65" y2="265" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-timissoara-lugoj" x1="65" y1="265" x2="170" y2="315" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-lugoj-mehadia" x1="170" y1="315" x2="180" y2="375" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-mehadia-drobeta" x1="180" y1="375" x2="170" y2="430" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-drobeta-craiova" x1="170" y1="430" x2="300" y2="450" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-craiova-rimnicu-vilcea" x1="300" y1="450" x2="270" y2="270" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-rimnicu-vilcea-sibiu" x1="270" y1="270" x2="235" y2="195" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-craiova-pitesti" x1="300" y1="450" x2="400" y2="335" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-rimnicu-vilcea-pitesti" x1="270" y1="270" x2="400" y2="335" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-pitesti-bucharest" x1="400" y1="335" x2="525" y2="389" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-sibiu-fagaras" x1="235" y1="195" x2="385" y2="210" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-fagaras-bucharest" x1="385" y1="210" x2="525" y2="389" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-bucharest-giurgiu" x1="525" y1="389" x2="485" y2="475" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-bucharest-urziceni" x1="525" y1="389" x2="605" y2="355" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-urziceni-hirsova" x1="605" y1="355" x2="720" y2="355" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-urziceni-vaslui" x1="605" y1="355" x2="685" y2="215" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-hirsova-eforie" x1="720" y1="355" x2="760" y2="440" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-vaslui-iasi" x1="685" y1="215" x2="630" y2="125" style="stroke:rgb(0,0,0);stroke-width:2" />
  <line id="line-iasi-neamt" x1="630" y1="125" x2="530" y2="80" style="stroke:rgb(0,0,0);stroke-width:2" />
</g>
<g id="path">
  </g>
<g>
  <ellipse stroke="#000" ry="5" rx="5" id="arad" cx="65" cy="145" fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="zerind" cx="90" cy="85"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="oradea" cx="120" cy="30"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="sibiu" cx="235" cy="195"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="timissoara" cx="65" cy="265"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="lugoj" cx="170" cy="315"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="mehadia" cx="180" cy="375"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="dobreta" cx="170" cy="430"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="craiova" cx="300" cy="450"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="rimnicu_vilcea" cx="270" cy="270"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="pitesti" cx="400" cy="335"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="fagaras" cx="385" cy="210"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="bucharest" cx="525" cy="389"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="giurgiu" cx="485" cy="475"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="urziceni" cx="605" cy="355"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="hirsova" cx="720" cy="355"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="eforie" cx="760" cy="440"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="vaslui" cx="685" cy="215"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="iasi" cx="630" cy="125"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
  <ellipse stroke="#000" ry="5" rx="5" id="neamt" cx="530" cy="80"  fill-opacity="null" stroke-opacity="null" stroke-width="1.5" fill="#000"/>
</g>

 </g>
</svg>
</div>

	</c:when>
		<c:otherwise>
			Não encontrou rota.
		</c:otherwise>
	</c:choose>
	<script type="text/javascript">
	var citiesList = 	[
	<c:forEach var="rota" items="${rota}" varStatus="loop">
	['${rota.estado}']	
	<c:if test="${not loop.last}">
	,
	</c:if>
	</c:forEach>
	];
    var route = [['arad','sibiu'], ['sibiu', 'fagaras'], ['fagaras', 'bucharest']];

    //route = JSON.stringify(route);

    var itip = null;
    var tip = null;
    var ttip = null;
        
    var map = null;
      $(document).ready(function() {
    	  itip = d3.tip()
          .attr('class', 'd3-tip')
          .offset([-10, 0])
          .html(function(d, i) {
            return "<strong>Atual:</strong> <span style='color:red'>" + d + "</span>";
          })
      tip = d3.tip()
          .attr('class', 'd3-tip')
          .offset([-10, 0])
          .html(function(d, i) {
            return "<strong>Cidade:</strong> <span style='color:red'>" + this.id + "</span>";
          })
      ttip = d3.tip()
      	  .direction('s')
          .attr('class', 'd3-tip')
          .offset([10, 0])
          .html(function(d, i) {
            return "<strong>Tail:</strong> <span style='color:red'>" + d + "</span>";
          })
      var cities = d3.selectAll('ellipse').call(tip).call(itip).call(ttip);
      //svg.append('rect').attr('width', 100).attr('height', 100).on('mouseover', tip.show).on('mouseout', tip.hide);
      cities.on('mouseover', tip.show).on('mouseout', tip.hide);

      map = d3.select('#path');

      //doRoute(route);
      bi_index = citiesList.findIndex(position);
      
      if(bi_index < 0){
	  	  doRouteList(citiesList, false);
      }else{
    	  	  head = citiesList.slice(0,bi_index);
    	  	  tail = citiesList.slice(bi_index + 1, citiesList.length);
    	  	  doRouteList(head, false);
    	  	  doRouteList(tail, true);
      }
      
    });
    
    function showTip(city){
    	   itip.show(city.toString().toLowerCase(),document.getElementById(city.toString().toLowerCase()));
    }
    function showTipTail(city){
 	   ttip.show(city.toString().toLowerCase(),document.getElementById(city.toString().toLowerCase()));
 	}
    function doRoute(route, t){
    	  if(t){
    		  showTipTail(route[0][0]);
    	  }else{
    	      showTip(route[0][0]);  
    	  }
      
      route.forEach(function(obj,index,collection) {
              setTimeout(function(){
                  console.log('trip');
                  linkCities(obj[0], obj[1]);
                  t?showTipTail(obj[1]):showTip(obj[1]);
              }, (index + 1) * 1500);
      });
    }
    function doRouteList(list, t){
    	  routes = [];
	    	for(i=1;i<list.length;i++){
	    	   routes.push([list[i-1],list[i]]);
	    	}
	    	doRoute(routes, t);
    }
    function linkCities(city1, city2){
    	  console.log('from', city1, 'to', city2)
    	
      x1 = d3.select('#' + city1).node().cx.baseVal.value;
      y1 = d3.select('#' + city1).node().cy.baseVal.value;
    
      x2 = d3.select('#' + city2).node().cx.baseVal.value;
      y2 = d3.select('#' + city2).node().cy.baseVal.value;

      map.append("line").attr("x1", x1).attr("y1", y1).attr("x2", x2).attr("y2", y2).attr("style", "stroke:rgb(255,0,0);stroke-width:3");

    }

    function clearRoute(){
      d3.select('#path').selectAll('line').remove();
    }

    function demo(){
      setTimeout(function(){linkCities('arad', 'sibiu')}, 1000);
      setTimeout(function(){linkCities('sibiu', 'fagaras')}, 2000);
      setTimeout(function(){linkCities('fagaras', 'bucharest')}, 3000);
    }
    
    function position(e,i,a){
    		if(e == ''){
    			return true;
    		}else{
    			return false;
    		}
    }

    </script>
	
</div>



