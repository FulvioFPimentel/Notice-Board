import { useRoute } from '@react-navigation/native';
import React, { useEffect, useState } from 'react';
import line from '../assets/icons/line.png'
import ellipse from '../assets/icons/ellipse.png'
import { View , Text, ScrollView, Image, ActivityIndicator } from 'react-native';
import { DetailsType } from '../components/MeetingCard';
import { api } from '../services';
import { text, theme } from '../styles';
import { MeetingType, SubSessionType } from './Meetings';

const MeetingDetails: React.FC<DetailsType> = ({route:{params:{id}}}) => {

    const [ meetingData, setMeetingData ] = useState<MeetingType>();
    const [ loading, setLoading ] = useState(false);
    
    async function fillMeeting (){
        setLoading(true)
        const res = await api.get(`/meetings/${id}`)
        setMeetingData(res.data);
        setLoading(false);
    }

    useEffect(() => {
        fillMeeting();
    }, [])

    return(

        <ScrollView style={theme.container}>
           
            {loading ? 
            <View style={theme.loadingPosition}>
                <ActivityIndicator size="large" color="#9E9E9E"/>
            </View>
            : (
                <View style={theme.meetingsContainer}>
                <View style={theme.meetingDetails}>
                    <View style={theme.detailsInfo}>
                        <Text style={text.infoType}>
                            Oração:
                        </Text>
                        <Text style={text.infoData}>
                            {meetingData?.prayers.map(a => {
                                if(a.moment === 1) {
                                    return a.designation.person;
                                }
                            })}
                        </Text>
                    </View>

                    <Text style={text.infoTitle}>
                        Cântico: {meetingData?.canticlesPerMeetings.map(a => {
                            if(a.moment === 1) {
                                return a.canticle.number
                            }
                        })}
                    </Text>
                </View>
                {meetingData?.sessions.map(a => {
                    
                    for (let index = 1; index <= meetingData.sessions.length; index++) {
                        
                        if(a.id === index){

                            const session = a.subsessions
                            session.sort(function (a, b){
                                return a.moment - b.moment;
                            })

                            return <View style={theme.meetingsContainer}> 

                            <Text style={text.titleDetailsMeeting}>
                                {a.session}
                            </Text>  
                            <Image source={line} style={theme.detailsLine} />
                            
                            {session.map(b => {

                                return <View  style={theme.boxMeetingDetails}>
                                            <Text style={text.boxInfoTitle}>
                                                <Image source={ellipse} />  {b.subsession} - ({b.time} min)
                                            </Text>
                                        <Text>
                                            {b.designations.map(c => {
                                                return (
                                                    <View style={theme.boxDetailsInfo}>
                                                        <Text style={text.infoType}>
                                                        {c.assignment} :
                                                        </Text>
                                                        
                                                        <Text style={text.infoData}>
                                                        {c.person}
                                                        </Text>
                                                    </View> 
                                                )
                                            })}
                                        </Text>
                                    </View>
                                })}
                            </View>
                        }
                    }
                })}

                <View style={theme.meetingDetails}>
                        <View style={theme.detailsInfo}>
                            <Text style={text.infoType}>
                                Oração:
                            </Text>
                            <Text style={text.infoData}>
                                {meetingData?.prayers.map(a => {
                                    if(a.moment === 2) {
                                        return a.designation.person;
                                    }
                                })}
                            </Text>
                        </View>

                        <Text style={text.infoTitle}>
                            Cântico: {meetingData?.canticlesPerMeetings.map(a => {
                                if(a.moment === 3) {
                                    return a.canticle.number
                                }
                            })}
                        </Text>
                    </View>
                </View>
            )}
          
        </ScrollView>
    )
}

export default MeetingDetails;