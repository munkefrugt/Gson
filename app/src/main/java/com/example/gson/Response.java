package com.example.gson;

import java.util.List;

/**
 * Created by v on 4/27/16.
 */


// when we call the link, aka url api thing, what we are fething from the server.
// here we recive the response.
// with a plugin "GsonFormat" plugin.

// rightclick-> geerate-> GsonFormat-> insert the json file from the, that has first been organised in json viwer.
    //-> click format  and ok


public class Response {
    /**
     * self : http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit=10&country=us
     * alternate : http://www.rottentomatoes.com/movie/box-office/
     */

    private LinksBean links;
    /**
     * movies : [{"id":"771370507","title":"The Jungle Book","year":2016,"mpaa_rating":"PG","runtime":111,"critics_consensus":"","release_dates":{"theater":"2016-04-15"},"ratings":{"critics_rating":"Certified Fresh","critics_score":94,"audience_rating":"Upright","audience_score":92},"synopsis":"Rudyard Kipling's beloved story returns to the screen in this Walt Disney Pictures production from director Jon Favreau (Elf, Iron Man). ~ Jason Buchanan, Rovi","posters":{"thumbnail":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw","profile":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw","detailed":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw","original":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw"},"abridged_cast":[{"name":"Neel Sethi","id":"771497949","characters":["Mowgli"]},{"name":"Neel Sethi","id":"771811999","characters":["Mowgli"]},{"name":"Bill Murray","id":"162653064","characters":["Baloo"]},{"name":"Ben Kingsley","id":"162653703","characters":["Bagheera"]},{"name":"Idris Elba","id":"162654425","characters":["Shere Khan"]}],"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507.json","alternate":"http://www.rottentomatoes.com/m/the_jungle_book_2016/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/similar.json"}},{"id":"771385884","title":"The Huntsman: Winter's War","year":2016,"mpaa_rating":"PG-13","runtime":123,"critics_consensus":"","release_dates":{"theater":"2016-04-22"},"ratings":{"critics_rating":"Rotten","critics_score":16,"audience_rating":"Spilled","audience_score":51},"synopsis":"Freya the Ice Queen (Emily Blunt) brings her sister Ravenna (Charlize Theron) back to life, and the powerful evil siblings plan to conquer the Enchanted Forest. Only the Huntsman (Chris Hemsworth) and his secret lover Sara (Jessica Chastain) can stop them in this sequel continuing the inventive twist on the Snow White fable.","posters":{"thumbnail":"http://resizing.flixster.com/0RYk8TqHM6Jp9kjKa1yIINoeZTo=/54x80/v1.bTsxMTczOTEzMDtqOzE2OTQ1OzIwNDg7MjAyNTszMDAw","profile":"http://resizing.flixster.com/0RYk8TqHM6Jp9kjKa1yIINoeZTo=/54x80/v1.bTsxMTczOTEzMDtqOzE2OTQ1OzIwNDg7MjAyNTszMDAw","detailed":"http://resizing.flixster.com/0RYk8TqHM6Jp9kjKa1yIINoeZTo=/54x80/v1.bTsxMTczOTEzMDtqOzE2OTQ1OzIwNDg7MjAyNTszMDAw","original":"http://resizing.flixster.com/0RYk8TqHM6Jp9kjKa1yIINoeZTo=/54x80/v1.bTsxMTczOTEzMDtqOzE2OTQ1OzIwNDg7MjAyNTszMDAw"},"abridged_cast":[{"name":"Chris Hemsworth","id":"770829335","characters":["The Huntsman"]},{"name":"Charlize Theron","id":"162654733","characters":["Ravenna"]},{"name":"Emily Blunt","id":"162685827","characters":["Freya"]},{"name":"Jessica Chastain","id":"770760183","characters":["Sara"]},{"name":"Nick Frost","id":"162684059","characters":["Nion"]}],"alternate_ids":{"imdb":"2381991"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385884.json","alternate":"http://www.rottentomatoes.com/m/the_huntsman_winters_war/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385884/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385884/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385884/similar.json"}},{"id":"771418740","title":"Barbershop: The Next Cut","year":2016,"mpaa_rating":"PG-13","runtime":112,"critics_consensus":"","release_dates":{"theater":"2016-04-15"},"ratings":{"critics_rating":"Fresh","critics_score":92,"audience_rating":"Upright","audience_score":77},"synopsis":"It's been more than 10 years since our last appointment at Calvin's Barbershop. Calvin and his longtime crew, including Eddie, are still there, but the shop has undergone some major changes. Most noticeably, our once male-dominated sanctuary is now co-ed. The ladies bring their own flavor, drama and gossip to the shop challenging the fellas at every turn. Despite the good times and camaraderie within the shop, the surrounding community has taken a turn for the worse, forcing Calvin and our crew to come together to not only save the shop, but their neighborhood.","posters":{"thumbnail":"http://resizing.flixster.com/qPhFWFjLR9d0GeFpbFKTKX9Jenw=/54x72/v1.bTsxMTI5NzcyMztqOzE3MDI4OzIwNDg7MTAwODsxMzQ0","profile":"http://resizing.flixster.com/qPhFWFjLR9d0GeFpbFKTKX9Jenw=/54x72/v1.bTsxMTI5NzcyMztqOzE3MDI4OzIwNDg7MTAwODsxMzQ0","detailed":"http://resizing.flixster.com/qPhFWFjLR9d0GeFpbFKTKX9Jenw=/54x72/v1.bTsxMTI5NzcyMztqOzE3MDI4OzIwNDg7MTAwODsxMzQ0","original":"http://resizing.flixster.com/qPhFWFjLR9d0GeFpbFKTKX9Jenw=/54x72/v1.bTsxMTI5NzcyMztqOzE3MDI4OzIwNDg7MTAwODsxMzQ0"},"abridged_cast":[{"name":"Ice Cube","id":"162652332","characters":["Calvin Palmer"]},{"name":"Cedric the Entertainer","id":"162652530","characters":["Eddie"]},{"name":"Regina Hall","id":"162667054","characters":["Angie"]},{"name":"Sean Patrick Thomas","id":"162662807","characters":["Jimmy"]},{"name":"Eve","id":"770669856","characters":["Terri"]}],"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771418740.json","alternate":"http://www.rottentomatoes.com/m/barbershop_the_next_cut_2016/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771418740/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771418740/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771418740/similar.json"}},{"id":"771362371","title":"Zootopia","year":2016,"mpaa_rating":"PG","runtime":108,"critics_consensus":"","release_dates":{"theater":"2016-03-04"},"ratings":{"critics_rating":"Certified Fresh","critics_score":98,"audience_rating":"Upright","audience_score":95},"synopsis":"The modern mammal metropolis of Zootopia is a city like no other. Comprised of habitat neighborhoods like ritzy Sahara Square and frigid Tundratown, it's a melting pot where animals from every environment live together-a place where no matter what you are, from the biggest elephant to the smallest shrew, you can be anything. But when rookie Officer Judy Hopps (voice of Ginnifer Goodwin) arrives, she discovers that being the first bunny on a police force of big, tough animals isn't so easy. Determined to prove herself, she jumps at the opportunity to crack a case, even if it means partnering with a fast-talking, scam-artist fox, Nick Wilde (voice of Jason Bateman), to solve the mystery. Walt Disney Animation Studios' \"Zootopia,\" a comedy-adventure directed by Byron Howard (\"Tangled,\" \"Bolt\") and Rich Moore (\"Wreck-It Ralph,\" \"The Simpsons\") and co-directed by Jared Bush (\"Penn Zero: Part-Time Hero\"), opens in theaters on March 4, 2016. Officer Judy Hopps (voice of Ginnifer Goodwin), the very first bunny on Zootopia's police force, jumps at the opportunity to crack her first case-even if it means partnering with fast-talking, scam-artist fox Nick Wilde (voice of Jason Bateman) to solve the mystery.","posters":{"thumbnail":"http://resizing.flixster.com/dPemRFRu7UrDenwBWAPyKvtG3TI=/54x80/v1.bTsxMTMxODA2ODtwOzE3MDMzOzIwNDg7NDk5Ozc0MQ","profile":"http://resizing.flixster.com/dPemRFRu7UrDenwBWAPyKvtG3TI=/54x80/v1.bTsxMTMxODA2ODtwOzE3MDMzOzIwNDg7NDk5Ozc0MQ","detailed":"http://resizing.flixster.com/dPemRFRu7UrDenwBWAPyKvtG3TI=/54x80/v1.bTsxMTMxODA2ODtwOzE3MDMzOzIwNDg7NDk5Ozc0MQ","original":"http://resizing.flixster.com/dPemRFRu7UrDenwBWAPyKvtG3TI=/54x80/v1.bTsxMTMxODA2ODtwOzE3MDMzOzIwNDg7NDk5Ozc0MQ"},"abridged_cast":[{"name":"Ginnifer Goodwin","id":"162655395","characters":["Judy Hopps"]},{"name":"Jason Bateman","id":"326298973","characters":["Nick Wilde"]},{"name":"Idris Elba","id":"162654425","characters":["Chief Bogo"]},{"name":"Jenny Slate","id":"771094239","characters":["Assistant Mayor Bellwether"]},{"name":"Nate Torrence","id":"770670473","characters":["Benjamin Clawhauser"]}],"alternate_ids":{"imdb":"2948356"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771362371.json","alternate":"http://www.rottentomatoes.com/m/zootopia/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771362371/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771362371/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771362371/similar.json"}},{"id":"771411543","title":"The Boss","year":2016,"mpaa_rating":"R","runtime":99,"critics_consensus":"","release_dates":{"theater":"2016-04-08"},"ratings":{"critics_rating":"Rotten","critics_score":20,"audience_rating":"Spilled","audience_score":46},"synopsis":"Academy Award (R)-nominated star Melissa McCarthy (Bridesmaids, The Heat, Tammy) headlines The Boss as a titan of industry who is sent to prison after she's caught for insider trading. When she emerges ready to rebrand herself as America's latest sweetheart, not everyone she screwed over is so quick to forgive and forget. McCarthy is joined in The Boss by an all-star cast led by Kristen Bell, Peter Dinklage and Kathy Bates. Directed by Ben Falcone (Tammy), the comedy is based on an original character created by McCarthy and written by McCarthy and Falcone alongside their Groundlings collaborator, Steve Mallory. The film is produced by McCarthy and Falcone through their On the Day productions and Will Ferrell, Adam McKay and Chris Henchy through their Gary Sanchez Productions.","posters":{"thumbnail":"http://resizing.flixster.com/wFOzSDjq2mBYX2BmQrcbGYKdvHc=/54x77/v1.bTsxMTIzNjc4MjtqOzE3MDE3OzIwNDg7Mjg0OzQwNQ","profile":"http://resizing.flixster.com/wFOzSDjq2mBYX2BmQrcbGYKdvHc=/54x77/v1.bTsxMTIzNjc4MjtqOzE3MDE3OzIwNDg7Mjg0OzQwNQ","detailed":"http://resizing.flixster.com/wFOzSDjq2mBYX2BmQrcbGYKdvHc=/54x77/v1.bTsxMTIzNjc4MjtqOzE3MDE3OzIwNDg7Mjg0OzQwNQ","original":"http://resizing.flixster.com/wFOzSDjq2mBYX2BmQrcbGYKdvHc=/54x77/v1.bTsxMTIzNjc4MjtqOzE3MDE3OzIwNDg7Mjg0OzQwNQ"},"abridged_cast":[{"name":"Melissa McCarthy","id":"528361348","characters":["Michelle Darnell"]},{"name":"Kristen Bell","id":"326395677","characters":["Claire"]},{"name":"Peter Dinklage","id":"162653586","characters":["Renault"]},{"name":"Kristen Schaal","id":"770792145","characters":["Sandy"]},{"name":"Kathy Bates","id":"162660148","characters":["Ida Marquette"]}],"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771411543.json","alternate":"http://www.rottentomatoes.com/m/the_boss_2016/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771411543/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771411543/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771411543/similar.json"}},{"id":"771363115","title":"Batman v Superman: Dawn of Justice","year":2016,"mpaa_rating":"PG-13","runtime":151,"critics_consensus":"","release_dates":{"theater":"2016-03-23"},"ratings":{"critics_rating":"Rotten","critics_score":28,"audience_rating":"Upright","audience_score":68},"synopsis":"Batman (Ben Affleck) and Superman (Henry Cavill) share the screen in this Warner Bros./DC Entertainment co-production penned by David S. Goyer and Chris Terrio, and directed by Zack Snyder. Amy Adams and Diane Lane return as Lois Lane and Martha Kent, respectively.","posters":{"thumbnail":"http://resizing.flixster.com/ie1vj_rolPLF4dTOLl1SvPw9MpU=/54x80/v1.bTsxMTcxNDAxMztqOzE2OTM4OzIwNDg7NDA1MDs2MDAw","profile":"http://resizing.flixster.com/ie1vj_rolPLF4dTOLl1SvPw9MpU=/54x80/v1.bTsxMTcxNDAxMztqOzE2OTM4OzIwNDg7NDA1MDs2MDAw","detailed":"http://resizing.flixster.com/ie1vj_rolPLF4dTOLl1SvPw9MpU=/54x80/v1.bTsxMTcxNDAxMztqOzE2OTM4OzIwNDg7NDA1MDs2MDAw","original":"http://resizing.flixster.com/ie1vj_rolPLF4dTOLl1SvPw9MpU=/54x80/v1.bTsxMTcxNDAxMztqOzE2OTM4OzIwNDg7NDA1MDs2MDAw"},"abridged_cast":[{"name":"Ben Affleck","id":"162665891","characters":["Bruce Wayne/Batman"]},{"name":"Henry Cavill","id":"341817917","characters":["Clark Kent/Superman"]},{"name":"Amy Adams","id":"162653029","characters":["Lois Lane"]},{"name":"Diane Lane","id":"162652926","characters":["Martha Kent"]},{"name":"Laurence Fishburne","id":"162669090","characters":["Perry White"]}],"alternate_ids":{"imdb":"2975590"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771363115.json","alternate":"http://www.rottentomatoes.com/m/batman_v_superman_dawn_of_justice/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771363115/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771363115/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771363115/similar.json"}},{"id":"771385979","title":"Criminal","year":2016,"mpaa_rating":"R","runtime":113,"critics_consensus":"","release_dates":{"theater":"2016-04-15"},"ratings":{"critics_rating":"Rotten","critics_score":31,"audience_rating":"Upright","audience_score":61},"synopsis":"From Summit Entertainment. The memories and skills of a CIA agent are implanted into the brain of a dangerous criminal in order to stop an international terrorist. (C) Summit","posters":{"thumbnail":"http://resizing.flixster.com/hUTSP_MGOxiKiOh1DpK4pc_iqv0=/53x81/v1.bTsxMTgwMjA0MDtqOzE2OTkxOzIwNDg7NTM4OzgyOQ","profile":"http://resizing.flixster.com/hUTSP_MGOxiKiOh1DpK4pc_iqv0=/53x81/v1.bTsxMTgwMjA0MDtqOzE2OTkxOzIwNDg7NTM4OzgyOQ","detailed":"http://resizing.flixster.com/hUTSP_MGOxiKiOh1DpK4pc_iqv0=/53x81/v1.bTsxMTgwMjA0MDtqOzE2OTkxOzIwNDg7NTM4OzgyOQ","original":"http://resizing.flixster.com/hUTSP_MGOxiKiOh1DpK4pc_iqv0=/53x81/v1.bTsxMTgwMjA0MDtqOzE2OTkxOzIwNDg7NTM4OzgyOQ"},"abridged_cast":[{"name":"Kevin Costner","id":"162662350","characters":["Jericho Stewart"]},{"name":"Gary Oldman","id":"162652649","characters":["Quaker Wells"]},{"name":"Tommy Lee Jones","id":"162666788","characters":["Dr. Franks"]},{"name":"Ryan Reynolds","id":"162652367","characters":["Bill Pope"]},{"name":"Jordi Molla","id":"364617086","characters":["Xavier Heimdahl"]}],"alternate_ids":{"imdb":"3014866"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385979.json","alternate":"http://www.rottentomatoes.com/m/criminal_2016/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385979/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385979/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771385979/similar.json"}},{"id":"771381397","title":"My Big Fat Greek Wedding 2","year":2016,"mpaa_rating":"PG-13","runtime":94,"critics_consensus":"","release_dates":{"theater":"2016-03-25"},"ratings":{"critics_rating":"Rotten","critics_score":28,"audience_rating":"Upright","audience_score":62},"synopsis":"Gold Circle Entertainment and HBO present a Playtone production of My Big Fat Greek Wedding 2, the long-awaited follow-up to the highest-grossing romantic comedy of all time. Written by Academy Award (R) nominee Nia Vardalos, who stars alongside the entire returning cast of favorites, the film reveals a Portokalos family secret that will bring the beloved characters back together for an even bigger and Greeker wedding. Kirk Jones (Nanny McPhee, Waking Ned Devine) directs the next chapter of the film that will be once again produced by Rita Wilson and Playtone partners Tom Hanks and Gary Goetzman. Paul Brooks and Steven Shareshian return to executive produce alongside Vardalos and Scott Niemeyer. Universal Pictures will distribute the comedy domestically and in select international territories.","posters":{"thumbnail":"http://resizing.flixster.com/Aj2d5D6i_H3zZgOjf6BHM7n06K4=/54x77/v1.bTsxMTU2NDM4NDtqOzE3MDIyOzIwNDg7Mjg0OzQwNQ","profile":"http://resizing.flixster.com/Aj2d5D6i_H3zZgOjf6BHM7n06K4=/54x77/v1.bTsxMTU2NDM4NDtqOzE3MDIyOzIwNDg7Mjg0OzQwNQ","detailed":"http://resizing.flixster.com/Aj2d5D6i_H3zZgOjf6BHM7n06K4=/54x77/v1.bTsxMTU2NDM4NDtqOzE3MDIyOzIwNDg7Mjg0OzQwNQ","original":"http://resizing.flixster.com/Aj2d5D6i_H3zZgOjf6BHM7n06K4=/54x77/v1.bTsxMTU2NDM4NDtqOzE3MDIyOzIwNDg7Mjg0OzQwNQ"},"abridged_cast":[{"name":"Nia Vardalos","id":"162661027","characters":["Toula Portokalos"]},{"name":"John Corbett","id":"162661028","characters":["Ian Miller"]},{"name":"Louis Mandylor","id":"335717108","characters":["Nick Portokalos"]},{"name":"Rita Wilson","id":"162721330","characters":["Anna"]},{"name":"Mark Margolis","id":"162686983","characters":["Panos"]}],"alternate_ids":{"imdb":"3760922"},"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771381397.json","alternate":"http://www.rottentomatoes.com/m/my_big_fat_greek_wedding_2/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771381397/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771381397/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771381397/similar.json"}},{"id":"771435247","title":"Compadres","year":2016,"mpaa_rating":"R","runtime":110,"release_dates":{"theater":"2016-04-22"},"ratings":{"critics_rating":"Rotten","critics_score":40,"audience_rating":"Spilled","audience_score":52},"synopsis":"After being released from prison, former Mexican cop GARZA (Omar Chaparro) seeks revenge on SANTOS (Erick Elias). Santos has kidnapped his girlfriend MARIA (Aislinn Derbez) and framed him for a crime he didn't commit. With the help of his former boss CORONADO (Jose Sefami), Garza manages to escape with a tip about how to find Santos which leads him to San Diego in search of an \"accountant.\" This said accountant is responsible for stealing $10 million dollars from Santos and may know Santos' whereabouts. When Garza arrives, he is shocked to find that the infamous accountant is a 17 year old American computer hacker named VIC (Joey Morgan). Despite an immediate disdain for each other, these two divided by culture, language and age, realize that Garza's low tech brain and Vic's high tech hacker skills may be their only chance at finding Santos before he finds them. The movie stars Omar Chaparro, one of Mexico's and the US Hispanic's biggest comedians and Aislinn Derbez; a rising star and Eugenio Derbez's daughter.","posters":{"thumbnail":"http://resizing.flixster.com/MTAaSvrlJxzrvJw1k1ZXttvCxJo=/54x80/v1.bTsxMTczMDEwMztqOzE2OTYzOzIwNDg7NTU0OzgyMQ","profile":"http://resizing.flixster.com/MTAaSvrlJxzrvJw1k1ZXttvCxJo=/54x80/v1.bTsxMTczMDEwMztqOzE2OTYzOzIwNDg7NTU0OzgyMQ","detailed":"http://resizing.flixster.com/MTAaSvrlJxzrvJw1k1ZXttvCxJo=/54x80/v1.bTsxMTczMDEwMztqOzE2OTYzOzIwNDg7NTU0OzgyMQ","original":"http://resizing.flixster.com/MTAaSvrlJxzrvJw1k1ZXttvCxJo=/54x80/v1.bTsxMTczMDEwMztqOzE2OTYzOzIwNDg7NTU0OzgyMQ"},"abridged_cast":[{"name":"Omar Chaparro","id":"770831289","characters":["Diego Garza","Garza"]},{"name":"Joey Morgan","id":"771121016","characters":["Vic"]},{"name":"Eric Roberts","id":"162653104","characters":["Dalton"]},{"name":"Kevin Pollak","id":"162675617","characters":["Tex The Banker"]},{"name":"Erick Elias","id":"771811641","characters":["Santos"]}],"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771435247.json","alternate":"http://www.rottentomatoes.com/m/compadres_2016/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771435247/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771435247/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771435247/similar.json"}},{"id":"771428818","title":"Eye In The Sky","year":2016,"mpaa_rating":"R","runtime":102,"critics_consensus":"","release_dates":{"theater":"2016-04-01"},"ratings":{"critics_rating":"Certified Fresh","critics_score":94,"audience_rating":"Upright","audience_score":87},"synopsis":"EYE IN THE SKY stars Helen Mirren as Colonel Katherine Powell, a UK-based military officer in command of a top secret drone operation to capture terrorists in Kenya. Through remote surveillance and on-the-ground intel, Powell discovers the targets are planning a suicide bombing and the mission escalates from \"capture\" to \"kill.\" But as American pilot Steve Watts (Aaron Paul) is about to engage, a nine-year old girl enters the kill zone triggering an international dispute, reaching the highest levels of US and British government, over the moral, political, and personal implications of modern warfare.","posters":{"thumbnail":"http://resizing.flixster.com/3yYKCTkroor1U1s6gXM3zr0l_Es=/54x80/v1.bTsxMTQzNDQ0OTtwOzE3MDQ2OzIwNDg7NDEzOzYxMw","profile":"http://resizing.flixster.com/3yYKCTkroor1U1s6gXM3zr0l_Es=/54x80/v1.bTsxMTQzNDQ0OTtwOzE3MDQ2OzIwNDg7NDEzOzYxMw","detailed":"http://resizing.flixster.com/3yYKCTkroor1U1s6gXM3zr0l_Es=/54x80/v1.bTsxMTQzNDQ0OTtwOzE3MDQ2OzIwNDg7NDEzOzYxMw","original":"http://resizing.flixster.com/3yYKCTkroor1U1s6gXM3zr0l_Es=/54x80/v1.bTsxMTQzNDQ0OTtwOzE3MDQ2OzIwNDg7NDEzOzYxMw"},"abridged_cast":[{"name":"Helen Mirren","id":"162662871","characters":["Col. Katherine Powell"]},{"name":"Aaron Paul","id":"410145522","characters":["Steve Watts"]},{"name":"Alan Rickman","id":"162666132","characters":["Lt. Gen. Frank Benson"]},{"name":"Barkhad Abdi","id":"771454315","characters":["Jama Farah"]},{"name":"Jeremy Northam","id":"162657055","characters":["Brian Woodale"]}],"links":{"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771428818.json","alternate":"http://www.rottentomatoes.com/m/eye_in_the_sky/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771428818/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771428818/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771428818/similar.json"}}]
     * links : {"self":"http://api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit=10&country=us","alternate":"http://www.rottentomatoes.com/movie/box-office/"}
     * link_template : //api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?limit={num-results}&country={country-code}
     */

    private String link_template;
    /**
     * id : 771370507
     * title : The Jungle Book
     * year : 2016
     * mpaa_rating : PG
     * runtime : 111
     * critics_consensus :
     * release_dates : {"theater":"2016-04-15"}
     * ratings : {"critics_rating":"Certified Fresh","critics_score":94,"audience_rating":"Upright","audience_score":92}
     * synopsis : Rudyard Kipling's beloved story returns to the screen in this Walt Disney Pictures production from director Jon Favreau (Elf, Iron Man). ~ Jason Buchanan, Rovi
     * posters : {"thumbnail":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw","profile":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw","detailed":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw","original":"http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw"}
     * abridged_cast : [{"name":"Neel Sethi","id":"771497949","characters":["Mowgli"]},{"name":"Neel Sethi","id":"771811999","characters":["Mowgli"]},{"name":"Bill Murray","id":"162653064","characters":["Baloo"]},{"name":"Ben Kingsley","id":"162653703","characters":["Bagheera"]},{"name":"Idris Elba","id":"162654425","characters":["Shere Khan"]}]
     * links : {"self":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507.json","alternate":"http://www.rottentomatoes.com/m/the_jungle_book_2016/","cast":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/cast.json","reviews":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/reviews.json","similar":"http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/similar.json"}
     */

    private List<MoviesBean> movies;

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public String getLink_template() {
        return link_template;
    }

    public void setLink_template(String link_template) {
        this.link_template = link_template;
    }

    public List<MoviesBean> getMovies() {
        return movies;
    }

    public void setMovies(List<MoviesBean> movies) {
        this.movies = movies;
    }

    public static class LinksBean {
        private String self;
        private String alternate;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getAlternate() {
            return alternate;
        }

        public void setAlternate(String alternate) {
            this.alternate = alternate;
        }
    }

    public static class MoviesBean {
        private String id;
        private String title;
        private int year;
        private String mpaa_rating;
        private int runtime;
        private String critics_consensus;
        /**
         * theater : 2016-04-15
         */

        private ReleaseDatesBean release_dates;
        /**
         * critics_rating : Certified Fresh
         * critics_score : 94
         * audience_rating : Upright
         * audience_score : 92
         */

        private RatingsBean ratings;
        private String synopsis;
        /**
         * thumbnail : http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw
         * profile : http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw
         * detailed : http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw
         * original : http://resizing.flixster.com/MFFPuVJRBrC5FxIxu0Hhu86HVbw=/54x80/v1.bTsxMTY1Mzk2MztqOzE3MDUyOzIwNDg7MTAxNDsxNTAw
         */

        private PostersBean posters;
        /**
         * self : http://api.rottentomatoes.com/api/public/v1.0/movies/771370507.json
         * alternate : http://www.rottentomatoes.com/m/the_jungle_book_2016/
         * cast : http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/cast.json
         * reviews : http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/reviews.json
         * similar : http://api.rottentomatoes.com/api/public/v1.0/movies/771370507/similar.json
         */

        private LinksBean links;
        /**
         * name : Neel Sethi
         * id : 771497949
         * characters : ["Mowgli"]
         */

        private List<AbridgedCastBean> abridged_cast;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getMpaa_rating() {
            return mpaa_rating;
        }

        public void setMpaa_rating(String mpaa_rating) {
            this.mpaa_rating = mpaa_rating;
        }

        public int getRuntime() {
            return runtime;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public String getCritics_consensus() {
            return critics_consensus;
        }

        public void setCritics_consensus(String critics_consensus) {
            this.critics_consensus = critics_consensus;
        }

        public ReleaseDatesBean getRelease_dates() {
            return release_dates;
        }

        public void setRelease_dates(ReleaseDatesBean release_dates) {
            this.release_dates = release_dates;
        }

        public RatingsBean getRatings() {
            return ratings;
        }

        public void setRatings(RatingsBean ratings) {
            this.ratings = ratings;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public PostersBean getPosters() {
            return posters;
        }

        public void setPosters(PostersBean posters) {
            this.posters = posters;
        }

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
            this.links = links;
        }

        public List<AbridgedCastBean> getAbridged_cast() {
            return abridged_cast;
        }

        public void setAbridged_cast(List<AbridgedCastBean> abridged_cast) {
            this.abridged_cast = abridged_cast;
        }

        public static class ReleaseDatesBean {
            private String theater;

            public String getTheater() {
                return theater;
            }

            public void setTheater(String theater) {
                this.theater = theater;
            }
        }

        public static class RatingsBean {
            private String critics_rating;
            private int critics_score;
            private String audience_rating;
            private int audience_score;

            public String getCritics_rating() {
                return critics_rating;
            }

            public void setCritics_rating(String critics_rating) {
                this.critics_rating = critics_rating;
            }

            public int getCritics_score() {
                return critics_score;
            }

            public void setCritics_score(int critics_score) {
                this.critics_score = critics_score;
            }

            public String getAudience_rating() {
                return audience_rating;
            }

            public void setAudience_rating(String audience_rating) {
                this.audience_rating = audience_rating;
            }

            public int getAudience_score() {
                return audience_score;
            }

            public void setAudience_score(int audience_score) {
                this.audience_score = audience_score;
            }
        }

        public static class PostersBean {
            private String thumbnail;
            private String profile;
            private String detailed;
            private String original;

            public String getThumbnail() {
                return thumbnail;
            }

            public void setThumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
            }

            public String getProfile() {
                return profile;
            }

            public void setProfile(String profile) {
                this.profile = profile;
            }

            public String getDetailed() {
                return detailed;
            }

            public void setDetailed(String detailed) {
                this.detailed = detailed;
            }

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }
        }

        public static class LinksBean {
            private String self;
            private String alternate;
            private String cast;
            private String reviews;
            private String similar;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public String getAlternate() {
                return alternate;
            }

            public void setAlternate(String alternate) {
                this.alternate = alternate;
            }

            public String getCast() {
                return cast;
            }

            public void setCast(String cast) {
                this.cast = cast;
            }

            public String getReviews() {
                return reviews;
            }

            public void setReviews(String reviews) {
                this.reviews = reviews;
            }

            public String getSimilar() {
                return similar;
            }

            public void setSimilar(String similar) {
                this.similar = similar;
            }
        }

        public static class AbridgedCastBean {
            private String name;
            private String id;
            private List<String> characters;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<String> getCharacters() {
                return characters;
            }

            public void setCharacters(List<String> characters) {
                this.characters = characters;
            }
        }
    }



}
